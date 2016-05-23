package com.ablelogix.ddf.utility;

public class Connection2DBException extends Exception {
	
	public Connection2DBException(){
		super();
	}

	@Override
	public String getMessage(){
		return "connection to db is not successful";
	}
}
