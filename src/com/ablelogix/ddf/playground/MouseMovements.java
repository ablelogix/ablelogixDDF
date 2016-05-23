package com.ablelogix.ddf.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	public WebDriver driver;
	
	public void launch_browser(){
		driver = new FirefoxDriver();
		driver.get("http://professional.demo.orangehrmlive.com/");
	}
	
	public void doLogin(String username,String password){
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}
	
	public void gotoAddEmployeesLink(){
		
		WebElement welcomeElm = driver.findElement(By.xpath("//*[@id='welcome']"));
		WebElement pimElm = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
		WebElement addEmpElm = driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));
		if(welcomeElm.isDisplayed()){
			Actions actionPIM = new Actions(driver);
			actionPIM.moveToElement(pimElm).build().perform();
			
			try {
				Thread.sleep(5000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(pimElm.isDisplayed()){
				Actions actionAddEmp = new Actions(driver);
				actionAddEmp.moveToElement(addEmpElm).build().perform();
				addEmpElm.click();
			}
			
		}
		
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseMovements obj = new MouseMovements();
		obj.launch_browser();
		obj.doLogin("admin", "admin");
		obj.gotoAddEmployeesLink();
		
		

	}

}
