package com.ablelogix.ddf.utility;

public interface FilePath {
	public static final String configFilePath = System.getProperty("user.dir")+"/src/com/ablelogix/ddf/config/config.properties";
	public static final String ORfilePath= System.getProperty("user.dir") + "/src/com/ablelogix/ddf/config/OR.properties";
	public static final String chromedriverpath=System.getProperty("user.dir")+"/src/com/ablelogix/ddf/drivers/chromedriver.exe";
	public static final String operadriverpath=System.getProperty("user.dir")+"/src/com/ablelogix/ddf/drivers/operadriver.exe";
	public static final String IEdriverpath=System.getProperty("user.dir")+"/src/com/ablelogix/ddf/drivers/IEDriverServer.exe";
}
