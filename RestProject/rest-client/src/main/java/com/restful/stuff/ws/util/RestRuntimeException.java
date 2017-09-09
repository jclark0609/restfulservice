package com.restful.stuff.ws.util;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class RestRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5141662535332035227L;

	public RestRuntimeException() {
		super();
	}
	
	public RestRuntimeException(String message) {
		super(message);
	}
	
	public RestRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public RestRuntimeException(Throwable cause) {
		super(cause);
	}
}
