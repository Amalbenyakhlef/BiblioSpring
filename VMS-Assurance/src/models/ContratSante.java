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
    private int medicauxGeneraliste;
    private int medicauxSpecialiste;
    private int optique;
    private int hospitaliers;
    private float niveauCouverture;  //juste pour des informations supplémentaires au niveau d'affichage !!!!
    
    
   
    
    public ContratSante(Date dc, Date db, Date df, Double prix, String type,int medG,int medS, int optique, int hospital, float niveauCouverture ) {
        super(dc, db, df, prix, type);
        medicauxGeneraliste=medG;
        medicauxSpecialiste=medS;
        this.optique=optique;
        hospitaliers=hospital;
        this.niveauCouverture=niveauCouverture;
    }

  
    
    @Override 
    public String toString(){
        super.toString();
        return (super.toString()+"le contrat de type Sante \n"+"les Frais couverts sont :\n Generaliste:"+medicauxGeneraliste+"\n Specialiste: "+medicauxSpecialiste+"\n Optique: "+optique+"\n hospitaliers: "+hospitaliers+"\n niveauCouverture: "+niveauCouverture) ;
    }
    
    public void ChoisirPlanCouverture(){
        //les expressions pour calculer le montant à remboursser pour chaque frais couverts !!!!
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Donner en moyenne les frais de Generaliste ");
        this.medicauxGeneraliste= sc.nextInt();
        
        System.out.println("Donner en moyenne les frais de specialiste ");
        this.medicauxSpecialiste= sc.nextInt();
        System.out.println("Donner en moyenne les frais optique ");
        this.optique= sc.nextInt();
        System.out.println("Donner en moyenne les frais d'hospitaliers");
        this.hospitaliers= sc.nextInt();
        
        
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
    
    public int getmedicauxGeneraliste (){return medicauxGeneraliste;}
    public int getmedicauxSpecialiste (){return medicauxSpecialiste;}
    public int getoptique (){return optique;}
    public int gethospitaliers (){return hospitaliers;}
    public float getniveauCouverture (){return niveauCouverture;}
    
    
    
}
