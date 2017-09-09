package com.restful.stuff.ws.service;

import org.springframework.stereotype.Service;

import com.restful.stuff.ws.domain.ExampleStuff;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	@Override
	public ExampleStuff generateExampleStuff() {
		return new ExampleStuff("this is the coolest thing ever", 1001001, true);
	}

}
