package com.example.blockchain.Models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Facture {
    private String reference;
    private Timestamp date;
    private double montant;
    private String acheteur;
    private Utilisateur utilisateurByAcheteur;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "montant")
    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Basic
    @Column(name = "acheteur")
    public String getAcheteur() {
        return acheteur;
    }

    public void setAcheteur(String acheteur) {
        this.acheteur = acheteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Facture facture = (Facture) o;

        if (Double.compare(facture.montant, montant) != 0) return false;
        if (reference != null ? !reference.equals(facture.reference) : facture.reference != null) return false;
        if (date != null ? !date.equals(facture.date) : facture.date != null) return false;
        if (acheteur != null ? !acheteur.equals(facture.acheteur) : facture.acheteur != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = reference != null ? reference.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(montant);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (acheteur != null ? acheteur.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "acheteur", referencedColumnName = "cin",insertable = false,updatable = false)
    public Utilisateur getUtilisateurByAcheteur() {
        return utilisateurByAcheteur;
    }

    public void setUtilisateurByAcheteur(Utilisateur utilisateurByAcheteur) {
        this.utilisateurByAcheteur = utilisateurByAcheteur;
    }
}
