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
public class ContratHabitation extends Contrat {
    private int niveauDeGarantie ;
    
    
    public ContratHabitation(Date dc, Date db, Date df, Double prix,int niveauDeGarantie) {
        super(dc, db, df, prix);
        this.niveauDeGarantie=niveauDeGarantie;
        
    }
    
    public String toString (){
        return super.toString()+" et le niveau de Garantie de Contrat habitation est  "+niveauDeGarantie;
    }
    
    
    public int getniveauDeGarantie (){return  niveauDeGarantie;}
}
