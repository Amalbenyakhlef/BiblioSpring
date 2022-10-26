/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
//import java.io.ObjectInputFilter;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author admin
 */

public class Contrat {
    private Date dateCreation;
    private Date dateDebut;
    private Date dateFin ;
    private Double prix;
    //private ObjectInputFilter.Status status;
    private String typeContrat;
    
    
    public Contrat (Date dc, Date db,Date df, Double prix,String type){  //ObjectInputFilter.Status st
        dateCreation=dc;
        dateDebut=db;
        dateFin=df;
        this.prix=prix;
        //status=st;
        typeContrat=type;
    }
    
    public Date getDateCreation(){return dateCreation;}
    public Date getDateDebut(){return dateDebut;}
    public Date getDateFin(){ return dateFin;}
    public Double getprix(){return prix;}
    public String getTypeContrat(){return typeContrat;}
    
    
    
    
}
