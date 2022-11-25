/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

//import java.io.ObjectInputFilter;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author admin
 */

public abstract class Contrat {
    private String IdContrat;
    private Date dateCreation;
    private Date dateDebut;
    private Date dateFin ;
    private Double prix;          
  
    
    
    public Contrat (Date dc, Date db,Date df, Double prix){  
        IdContrat= UUID.randomUUID().toString();  
        dateCreation=dc;
        dateDebut=db;
        dateFin=df;
        this.prix=prix;
        
        
    }
    
    
     public String toString(){
        return "le contrat d'id: "+IdContrat+" est cree dans :"+this.dateCreation+" \n a partir de "+this.dateDebut+"\n et ce termine le "+this.dateFin +" \n et le type de contrat est ";
    }
     
   
    
    public String getId(){return IdContrat;}
    public Date getDateCreation(){return dateCreation;}
    public Date getDateDebut(){return dateDebut;}
    public Date getDateFin(){ return dateFin;}
    public Double getprix(){return prix;}
    

 
    
    
}
