package ateprosdiana.controller;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ateprosdiana.model.Item;

@Path("/Item")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ItemController {

    // list all data item
    @GET
    public Response InputPathParameter(@PathParam("nama") String nama) {
        return Response.status(Response.Status.OK).entity(Item.findAll()).build();
    }

    // POST/item =>Created item
    @POST
    public Response post(Map<String, Object> request) {
        Item item = new Item();
        item.name = request.get("name").toString();
        item.count = request.get("count").toString();
        item.price = request.get("price").toString();
        item.count = request.get("count").toString();
        item.type = request.get("type").toString();
        item.description = request.get("description").toString();
        item.createdAt = request.get("createdAt").toString();
        item.updatedAt = request.get("updatedAt").toString();

        // save to database
        item.persist();

        return Response.status(Response.Status.CREATED).entity(new HashMap<>()).build();
    }

}
