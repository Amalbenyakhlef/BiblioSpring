/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.Date;
//import java.util.ArrayList;
//import java.util.stream.*;
//import models.Contrat;


/**
 *
 * @author Acer
 */
public class Client extends personne {
    private int idClient;
    private int nbSinistresFaits;
    //private ArrayList<Contrat> ListContrat;
    
    
    
    public Client(String nom,String prenom,String password,String email,String tel,Date datenaiss,int idClient,int nbSinistresFaits){
        super( nom, prenom, password, email,tel, datenaiss);
        this.idClient=idClient;
        this.nbSinistresFaits=nbSinistresFaits;
        //ListContrat= new ArrayList();
    }

    public int getIdClient() {
        return idClient;
    }

    public int getNbSinistresFaits() {
        return nbSinistresFaits;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNbSinistresFaits(int nbSinistresFaits) {
        this.nbSinistresFaits = nbSinistresFaits;
    }
    
    @Override
    public String toString (){
        
        return ( super.toString()+"==> le Client de l'id: "+idClient+" a fait "+nbSinistresFaits/*+" Sinistres et qui admet cette Liste de Contrat avec l'assurance "*/);
        
    }
    
    /*public void ajouterContrat (Contrat C){
        this.ListContrat.add(C);
    }
    
    public void supprimerContrat(String id){
        
        Stream <Contrat> str = ListContrat.stream();

        Stream <Contrat> str1 = str.filter(line->line.getId().equals(id));

        this.ListContrat.remove(str1);
        
    }
    
    public void afficherListContrat (){
        /*Stream <Contrat> str = ListContrat.stream();
        Stream <Contrat> str1 = str.filter(line->line>0);
        str1.forEach(System.out::printLn);

        
        Stream List = Stream.of(ListContrat);
        //System.out.println(List.collect(Collectors.toList()));
        
        // Print the stream
        List.forEach(s -> System.out.println(s));
  
        // Since the stream has been already consumed
        // this will throw exception
        try {
  
            // Print the stream
            List.forEach(s -> System.out.println(s));
        }
  
        catch (Exception e) {
  
            System.out.println("\nException: " + e);
        }
    }
    */
    
}
