package com.restful.stuff.ws.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public final class JacksonProviderFactory {

	protected JacksonProviderFactory() {
		super();
	}
	
	public static JacksonJsonProvider createJsonProvider() {
		JacksonJsonProvider jacksonProvider = new JacksonJsonProvider();
		jacksonProvider.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return jacksonProvider;
	}
}
