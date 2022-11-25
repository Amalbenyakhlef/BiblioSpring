/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class admin extends personne{
    private int nbSinistres;
    private int nbContratsValides;

    public admin(int nbSinistres, int nbContratsValides, String nom, String prenom, String password, String email, String tel, Date datenaiss) {
        super(nom, prenom, password, email, tel, datenaiss);
        this.nbSinistres = nbSinistres;
        this.nbContratsValides = nbContratsValides;
    }

    public int getNbSinistres() {
        return nbSinistres;
    }

    public int getNbContratsValides() {
        return nbContratsValides;
    }

    public void setNbSinistres(int nbSinistres) {
        this.nbSinistres = nbSinistres;
    }

    public void setNbContratsValides(int nbContratsValides) {
        this.nbContratsValides = nbContratsValides;
    }
    
   
  
}
