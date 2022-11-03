/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

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
    
    
    public ContratSante(Date dc, Date db, Date df, Double prix, String type,float medG, float medS, float optique, float hospital, float niveauCouverture ) {
        super(dc, db, df, prix, type);
        medicauxGeneraliste=medG;
        medicauxSpecialiste=medS;
        this.optique=optique;
        hospitaliers=hospital;
        this.niveauCouverture=niveauCouverture;
    }
    
    public void ChoisirPlanCouverture(){
        //les expressions pour calculer le montant à remboursser pour chaque frais couverts !!!!
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Donner en moyenne les frais de Generaliste ");
        float medicauxGeneraliste= sc.nextFloat();
        System.out.println("Donner en moyenne les frais de specialiste ");
        float medicauxSpecialiste= sc.nextFloat();
        System.out.println("Donner en moyenne les frais optique ");
        float optique= sc.nextFloat();
        System.out.println("Donner en moyenne les frais d'hospitaliers");
        float hospitaliers= sc.nextFloat();
        
        
        System.out.println("Choisir le niveau de couverture Santé");
        
        System.out.println("1-Niveau élevée (100%)");
        System.out.println("2-Niveau Moyen (80%)");
        System.out.println("3-Niveau Faible (50%)");
        int niveau = sc.nextInt();
        
        switch(niveau) {
            case 1:{
                niveauCouverture=1;
             break;}
            case 2:{
                niveauCouverture=(float) 0.8;
                 break;}
            case 3:{
                niveauCouverture=(float) 0.5;
            break;}        
    }
    
}
    
    @Override 
    public void saisirContrat() throws ParseException{
        
        super.saisirContrat();
        ChoisirPlanCouverture();
        
    }
    
    public float getmedicauxGeneraliste (){return medicauxGeneraliste;}
    public float getmedicauxSpecialiste (){return medicauxSpecialiste;}
    public float getoptique (){return optique;}
    public float gethospitaliers (){return hospitaliers;}
    public float getniveauCouverture (){return niveauCouverture;}
    
    
    
}
