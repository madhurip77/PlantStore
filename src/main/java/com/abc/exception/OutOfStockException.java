package com.abc.exception;
public class OutOfStockException extends RuntimeException{

	
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OutOfStockException(String message) {
		super();
		this.message = message;
	}
	
	public OutOfStockException() {
		super();
	}

}
