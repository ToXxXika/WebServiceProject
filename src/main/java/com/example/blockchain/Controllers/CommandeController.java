package com.example.blockchain.Controllers;


import com.example.blockchain.Models.Commande;
import com.example.blockchain.Services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/commande")
@RestController
@CrossOrigin("*")
public class CommandeController {
   @Autowired
    private CommandeService commandeService;

   @PostMapping("/addc")
    public boolean addCommande(@RequestBody Commande commande){
         return commandeService.addCommande(commande);
    }
}
