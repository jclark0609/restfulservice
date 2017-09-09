package com.restful.stuff.ws.domain

import com.restful.stuff.ws.domain.ExampleStuff
import spock.lang.Specification

class ExampleStuffSpec extends Specification {

	def testConstructor() {
		when:
		ExampleStuff example = new ExampleStuff("this is stuff", 1, false)
		
		then:
		assert example.getStuff().equals("this is stuff")
		assert example.getIntStuff() == 1
		assert !example.isBoolStuff()
	}
}
