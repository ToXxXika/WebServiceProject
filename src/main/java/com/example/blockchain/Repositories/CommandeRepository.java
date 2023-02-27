package com.example.blockchain.Repositories;


import com.example.blockchain.Models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository  extends JpaRepository<Commande, String> {
}
