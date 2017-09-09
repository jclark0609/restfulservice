package com.restful.stuff.ws.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;

import com.restful.stuff.ws.domain.ExampleStuff;
import com.restful.stuff.ws.jackson.JacksonProviderFactory;
import com.restful.stuff.ws.service.ExampleService;
import com.restful.stuff.ws.util.RestGenericExceptionResponseMapper;

public class ExampleClient implements ExampleService {

	private ExampleService serviceProxy;
	
	public ExampleClient(String serverEndpointUrl) {
		JAXRSClientFactoryBean clientFactoryBean = new JAXRSClientFactoryBean();
		clientFactoryBean.setAddress(serverEndpointUrl);
		clientFactoryBean.setServiceClass(ExampleService.class);
		List<Object> providers = new ArrayList<Object>();
		providers.add(JacksonProviderFactory.createJsonProvider());
		providers.add(new RestGenericExceptionResponseMapper());
		clientFactoryBean.setProviders(providers);
		this.serviceProxy = clientFactoryBean.create(ExampleService.class);
	}
	
	@Override
	public ExampleStuff generateExampleStuff() {
		return serviceProxy.generateExampleStuff();
	}
}
