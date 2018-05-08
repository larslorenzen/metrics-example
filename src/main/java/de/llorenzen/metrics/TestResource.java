package de.llorenzen.metrics;

import org.eclipse.microprofile.metrics.annotation.Timed;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("/test")
public class TestResource {

    @GET
//    @Timed
    public String getTest() {
        return "works";
    }

}