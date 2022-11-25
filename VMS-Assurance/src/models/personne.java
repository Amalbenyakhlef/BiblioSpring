/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.*;

/**
 *
 * @author Acer
 */
public class personne {
    private String nom;
    private String prenom;
    private String password;
    private String email;
    private String tel;
    private Date datenaiss;

    public personne(String nom, String prenom, String password, String email, String tel, Date datenaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.email = email;
        this.tel = tel;
        this.datenaiss = datenaiss;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setDatenaiss(Date datenaiss) {
        this.datenaiss = datenaiss;
    }

    public Date getDatenaiss() {
        return datenaiss;
    }
    
    
   
    
    public String toString (){
        
       return " le nom: "+nom+"\n le prenom :"+prenom+"\n le password de compte : "+password+"\n l'email :"+email+"\n tel: "+tel+"\n la date de naissance: "+datenaiss+"\n";
    }
    
    
  
  
   
}
