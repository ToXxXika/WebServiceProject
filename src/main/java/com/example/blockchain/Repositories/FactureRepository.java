package com.example.blockchain.Repositories;

import com.example.blockchain.Models.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, String> {
}
