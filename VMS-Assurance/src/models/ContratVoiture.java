/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author admin
 */
public class ContratVoiture extends Contrat {
    
    private String marque;
    private String modele;
    private Date dateMiseEnCirculation;
    private String niveauCouverture;
    private String typeVehicule;
  
   
    
    public ContratVoiture(Date dc, Date db, Date df, Double prix,String marque,String modele,Date d,String niveauCouverture ,String typeVehicule) {
        super(dc, db, df, prix);
        this.marque=marque;
        this.modele=modele;
        dateMiseEnCirculation=d;
        this.niveauCouverture=niveauCouverture;
        this.typeVehicule=typeVehicule;
        
    }
    
    public String getmarque (){ return marque;}
    public String getmodele (){ return modele;}
    public Date getdateMiseEnCirculation (){ return dateMiseEnCirculation;}
    public String getniveauCouverture (){ return niveauCouverture;}
    public String gettypeVehicule (){ return typeVehicule;}
    
}
