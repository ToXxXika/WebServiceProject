package com.example.blockchain.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "commande")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String ReferenceCommande ;

    private String idProduit;
    private String dateCommande;
    private String dateLivraison;
    private String etat;
    private String quantite;
    private String prix;



}
