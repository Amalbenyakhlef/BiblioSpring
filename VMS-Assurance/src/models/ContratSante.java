/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
//import java.text.ParseException;
import java.util.Date;
//import java.util.Scanner;
/**
 *
 * @author admin
 */
public class ContratSante extends Contrat {
    private float medicauxGeneraliste;
    private float medicauxSpecialiste;
    private float optique;
    private float hospitaliers;
    private float niveauCouverture;  //juste pour des informations supplémentaires au niveau d'affichage !!!!
    
    
   
    
    public ContratSante(Date dc, Date db, Date df, Double prix,float medG,float medS, float optique, float hospital, float niveauCouverture ) {
        super(dc, db, df, prix);
        medicauxGeneraliste=medG;
        medicauxSpecialiste=medS;
        this.optique=optique;
        hospitaliers=hospital;
        this.niveauCouverture=niveauCouverture;
    }

  
    
    @Override 
    public String toString(){
        //super.toString();
        return (super.toString()+"\n"+"le contrat de type Sante \n"+"les Frais couverts sont :\n Generaliste:"+medicauxGeneraliste+"\n Specialiste: "+medicauxSpecialiste+"\n Optique: "+optique+"\n hospitaliers: "+hospitaliers+"\n niveauCouverture: "+niveauCouverture+"\n") ;
    }
    
  
    
    public float getmedicauxGeneraliste (){return medicauxGeneraliste;}
    public float getmedicauxSpecialiste (){return medicauxSpecialiste;}
    public float getoptique (){return optique;}
    public float gethospitaliers (){return hospitaliers;}
    public float getniveauCouverture (){return niveauCouverture;}
    
    
    
}
