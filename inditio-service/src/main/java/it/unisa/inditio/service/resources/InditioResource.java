package it.unisa.inditio.service.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Daniele Damiano
 */
@Path("algo")
public class InditioResource {
    
    @GET
    public Response ping(){
        return Response.ok("CIao",MediaType.APPLICATION_JSON).build();
                
    }
    @Path("paramquery")
    @GET
    public Response helloQueryParam(@QueryParam("message") String message){
       return Response.ok("Messaggio:="+message).build();
    }
    
    @Path("parampath/{text}")
    @GET
    public Response helloPathParam(@PathParam("text") String text){
       return Response.ok("Messaggio:="+text).build();
    }
    
    @GET
    @Path("objectxml")
    public Response helloxml(){
        return Response.ok(new Test("daniele", "damiano")).build();
    }
    
    @GET
    @Path("objectjson")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hellojson(){
        return Response.ok(new Test("daniele", "damiano")).build();
    }
}
