/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personne;
import Personne.personne;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Client extends personne {
    private int idClient;
    private int nbSinistresFaits;
    public Client(String nom,String prenom,String password,String email,String tel,Date datenaiss,int idClient,int nbSinistresFaits){
        super( nom, prenom, password, email,tel, datenaiss);
        this.idClient=idClient;
        this.nbSinistresFaits=nbSinistresFaits;
    }
    public void saisirContrat(){
        
    }
}
