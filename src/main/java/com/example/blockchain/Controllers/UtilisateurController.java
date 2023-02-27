package com.example.blockchain.Controllers;


import com.example.blockchain.Models.Utilisateur;
import com.example.blockchain.Services.UtilisateurService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;

import java.util.List;


@Path("/user")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public List<Utilisateur> getutilisateurs(){
        return utilisateurService.getutilisateurs();
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/add")
    public Utilisateur addUtilisateur(Utilisateur utilisateur){
        return utilisateurService.addUtilisateur(utilisateur);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/delete/{id}")
    public boolean deleteUtilisateur(@Param("id") int id){
        return utilisateurService.deleteUtilisateur(id);
    }



}
