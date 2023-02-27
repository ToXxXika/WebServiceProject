package com.example.blockchain.Services;



import com.example.blockchain.Models.Commande;
import com.example.blockchain.Repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService  {
    @Autowired
    private CommandeRepository commandeRepository;


    public  boolean addCommande( Commande commande){
        try {
            commandeRepository.save(commande);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public List<Commande> getCommandes(){
        return commandeRepository.findAll();
    }


}
