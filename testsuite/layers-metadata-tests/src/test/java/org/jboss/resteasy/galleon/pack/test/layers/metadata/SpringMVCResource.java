package org.jboss.resteasy.galleon.pack.test.layers.metadata;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import org.springframework.stereotype.Controller;
import  jakarta.ws.rs.core.MediaType;
@Controller
@Path("/spring")
public class SpringMVCResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello";

    }

}
