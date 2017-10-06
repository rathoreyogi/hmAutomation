package com.happiestmind.automation.exception;

public class ComparisonFailureCustomException extends Exception implements CloudLendingAutomationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -467783825587092393L;

	public ComparisonFailureCustomException(String message) {
		super(message);
	}

	public ComparisonFailureCustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public ComparisonFailureCustomException(Throwable cause) {
		super(cause);
	}

}
