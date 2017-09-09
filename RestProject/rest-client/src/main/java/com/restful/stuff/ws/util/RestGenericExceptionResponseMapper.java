package com.restful.stuff.ws.util;

import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.ResponseExceptionMapper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingJsonFactory;

public class RestGenericExceptionResponseMapper implements ResponseExceptionMapper<Throwable> {

	public static final String EXCEPTION_CLASS = "restExceptionClass";
	
	@Override
	public Throwable fromResponse(Response response) {
		try {
			String className = (String) response.getHeaders().getFirst(EXCEPTION_CLASS);
			if (className == null) {
				return null;
			}
			
			Class<?> clz = Class.forName(className);
			MappingJsonFactory factory = new MappingJsonFactory();
			JsonParser parser = factory.createParser((InputStream) response.getEntity());
			return (Throwable) parser.readValueAs(clz);
		} catch (ClassNotFoundException | IOException ex) {
			return new RestRuntimeException("Could not deserialize server side exception: " + ex.getMessage());
		}
	}
}
