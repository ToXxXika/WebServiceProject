package com.example.blockchain.Services;

import com.example.blockchain.Models.Facture;
import com.example.blockchain.Repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureService {

    @Autowired
    private FactureRepository factureRepository;

    public List<Facture> getAllFactures(){
        return factureRepository.findAll();
    }
    public boolean addFacture(Facture facture){

        if(factureRepository.save(facture) != null){
            return true;
        }
        return false;
    }
    public boolean deleteFacture(String reference){
        if(factureRepository.existsById(reference)){
            factureRepository.deleteById(reference);
            System.out.println("deleted");
            return true;
        }
        return false;
    }

}
