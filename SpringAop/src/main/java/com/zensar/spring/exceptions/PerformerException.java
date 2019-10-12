package com.zensar.spring.exceptions;

public class PerformerException extends Exception {
	private String errorMessage;
	public PerformerException() {
		// TODO Auto-generated constructor stub
		System.out.println("Performance is not good");
	}
	public PerformerException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "PerformerException [errorMessage=" + errorMessage + "]";
	}
	
}
