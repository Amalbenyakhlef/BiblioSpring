/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


//import java.io.ObjectInputFilter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */

public abstract class Contrat {
    private Date dateCreation;
    private Date dateDebut;
    private Date dateFin ;
    private Double prix;
    private String typeContrat;
    
    
    public Contrat (Date dc, Date db,Date df, Double prix,String type){  //ObjectInputFilter.Status st
        dateCreation=dc;
        dateDebut=db;
        dateFin=df;
        this.prix=prix;
        typeContrat=type;
    }
    
    public void saisirContrat() throws ParseException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisissez le date de Creation de Contrat (JJ/MM/AAAA) :");
                String strC = sc.nextLine();
            if(strC.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
                 SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");
            String sDate = null;
            Date dateCreation = f.parse(sDate);
        }
            else {
                 System.out.println("Erreur format");
        
            }
            
            
        System.out.println("Saisissez le date de debut de Contrat (JJ/MM/AAAA) :");
                String strD = sc.nextLine();
            if(strD.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
                 SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");
            String sDate = null;
            Date dateDebut= f.parse(sDate);
        }
            else {
                 System.out.println("Erreur format");
                }
            
        System.out.println("Saisissez le date de debut de Contrat (JJ/MM/AAAA) :");
                String strF = sc.nextLine();
            if(strF.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
                 SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");
            String sDate = null;
            Date dateFin = f.parse(sDate);
        }
            else {
                 System.out.println("Erreur format");
                }
            
       
        System.out.println("Veuillez Choisir le Type de Contrat:");
        System.out.println("1-Contrat Santé");
        System.out.println("2-Contrat Voiture");
        System.out.println("3-Contrat Habitation");
        
        int numT=0;
        int numType=sc.nextInt();
        while ((numType !=1) && (numType!=2) && (numType!=3)){
            numT=sc.nextInt();
    }
        
        if ((numType ==1) || (numType==2)|| (numType==3)){
            switch(numType) {
            case 1:
                typeContrat="sante";
             break;
            case 2:
                typeContrat="voiture";
                 break;
            case 3:
                typeContrat="habitation";
            break;
            }
}
            else {
        switch(numT) {
            case 1:{
                typeContrat="sante";
             break;}
            case 2:{
                typeContrat="voiture";
                 break;}
            case 3:{
                typeContrat="habitation";
            break;}
        }
                    
        }
        
           
    }
    
    public Date getDateCreation(){return dateCreation;}
    public Date getDateDebut(){return dateDebut;}
    public Date getDateFin(){ return dateFin;}
    public Double getprix(){return prix;}
    public String getTypeContrat(){return typeContrat;}

 
    
    
}
