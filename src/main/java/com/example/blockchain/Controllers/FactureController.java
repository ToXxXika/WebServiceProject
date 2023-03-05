package com.example.blockchain.Controllers;


import com.example.blockchain.Models.Facture;
import com.example.blockchain.Services.FactureService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Path("/facture")
public class FactureController {

    @Autowired
    private FactureService factureService;



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public List<Facture> getFactures(){
        return factureService.getAllFactures();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add")
    public boolean addFacture(Facture facture){
        return factureService.addFacture(facture);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/delete/{reference}")
    public boolean deleteFacture(@PathParam("reference") String reference){
        return factureService.deleteFacture(reference);
    }

}
