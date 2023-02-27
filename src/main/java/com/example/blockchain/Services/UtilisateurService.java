package com.example.blockchain.Services;



import com.example.blockchain.Models.Utilisateur;
import com.example.blockchain.Repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getutilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

   /* public boolean deleteUtilisateur(int id) {
        utilisateurRepository.deleteById(id);
        return true;
    }*/

}
