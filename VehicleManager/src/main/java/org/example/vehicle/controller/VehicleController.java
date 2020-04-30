package org.example.vehicle.controller;

import org.example.service.VehicleService;
import org.example.util.VehicleDTO;
import org.example.util.VehicleMapper;
import org.example.validation.ValidVehicleRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vehicle")
public class VehicleController {

    VehicleService service = new VehicleService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVehicles(){
        return Response.ok(service.getVehicles()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addVehicle(@ValidVehicleRequest VehicleDTO vehicleDTO){
        service.addVehicle(VehicleMapper.MAP_TO_VEHICLE.apply(vehicleDTO));
        return Response.status(201).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putBrands(@PathParam("id") int id, VehicleDTO vehicleDTO){
        service.updateVehicle(VehicleMapper.MAP_TO_VEHICLE.apply(vehicleDTO), id);
        return Response.status(201).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteVehicle(@PathParam("id") int id){
        service.deleteVehicle(id);
        return Response.status(202).build();
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getVehicle(@PathParam("id") int id){
        return Response.ok(service.getVehicle(id)).build();
    }


    /*
    * I added 2 call options to circumvent the CORS: Access-Control-Allow-Origin problem that
    *  occurs with path and post methods even when I add a header
    * .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Headers", "Content-Type")
        .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE")
    * */

    @OPTIONS
    @Consumes(MediaType.APPLICATION_JSON)
    public Response optionsVehicle(){
        return Response.status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "Content-Type")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE")
                .build();
    }

    @OPTIONS
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response optionsVehicleById(){
        return Response.status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "Content-Type")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE")
                .build();
    }
}
