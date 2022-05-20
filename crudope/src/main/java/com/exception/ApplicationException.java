package com.exception;

public class ApplicationException extends Exception{
	private String exceptionMessage;

	public ApplicationException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return exceptionMessage;
	}
	
	

}
