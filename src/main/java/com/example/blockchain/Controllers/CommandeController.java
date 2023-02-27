package com.example.blockchain.Controllers;


import com.example.blockchain.Models.Commande;
import com.example.blockchain.Services.CommandeService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Path("/commande")

public class CommandeController {
   @Autowired
    private CommandeService commandeService;

   @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public List<Commande> getCommandes(){
        return commandeService.getCommandes();
    }
}
