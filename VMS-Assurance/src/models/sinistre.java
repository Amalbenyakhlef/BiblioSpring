/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.Date;
/**
 *
 * @author Acer
 */
public class sinistre {
    private Date dateDeclaration;
    private Double degats;
    private int idConstat;
    private String type;

    public sinistre(Date dateDeclaration, Double degats, int idConstat, String type) {
        this.dateDeclaration = dateDeclaration;
        this.degats = degats;
        this.idConstat = idConstat;
        this.type = type;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public Double getDegats() {
        return degats;
    }

    public int getIdConstat() {
        return idConstat;
    }

    public String getType() {
        return type;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public void setDegats(Double degats) {
        this.degats = degats;
    }

    public void setIdConstat(int idConstat) {
        this.idConstat = idConstat;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "sinistre{" + "dateDeclaration=" + dateDeclaration + ", degats=" + degats + ", idConstat=" + idConstat + ", type=" + type + '}';
    }
    
    
   
    
   
}
