package com.restful.stuff.ws.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.Descriptions;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import com.restful.stuff.ws.domain.ExampleStuff;

@Path("example")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Description(value = "Provides an example rest service.", target = DocTarget.RESOURCE)
public interface ExampleService {

	@GET
	@Path("/generate")
	@Descriptions({@Description(value = "Randomly generate an ExampleStuff class", target = DocTarget.METHOD), 
		@Description(value = "ExampleStuff", target = DocTarget.RETURN)})
	ExampleStuff generateExampleStuff();
}
