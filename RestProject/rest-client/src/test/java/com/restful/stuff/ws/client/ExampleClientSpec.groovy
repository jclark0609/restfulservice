package com.restful.stuff.ws.client

import com.restful.stuff.ws.domain.ExampleStuff
import com.restful.stuff.ws.service.ExampleService
import spock.lang.Specification

class ExampleClientSpec extends Specification {

	ExampleService serviceMock = Mock()
	
	def testGenerateExampleStuff() {
		setup:
		ExampleClient client = new ExampleClient("test")
		client.serviceProxy = serviceMock
		ExampleStuff stuff = new ExampleStuff("this", 1, false)
		
		when:
		1 * serviceMock.generateExampleStuff() >> stuff
		
		then:
		assert stuff == client.generateExampleStuff()
	}
}
