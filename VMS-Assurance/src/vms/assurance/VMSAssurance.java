/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package vms.assurance;
import java.text.ParseException;
import models.*;

//import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;





/**
 *
 * @author admin
 */
public class VMSAssurance extends Application {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        launch(args);
        Date d = new Date();
        Date d1 = new Date();
        Date d2 = new Date();
        
        //SimpleDateFormat d = new SimpleDateFormat("MM-dd-yyyy");
        Client c=new Client("rahma","radhedh","123","rahma.radhedh@gmail.com","23456789",d,1234,0);
        
       ContratSante c1=new ContratSante(d, d1, d2, 12.333, "Sante",123, 23, 23, 2533,(float)0.00);    
       ContratSante c2=new ContratSante(d, d1, d2, 123.3, "Sante",124, 345, 1234, 456,(float)0.00); 
       c1.saisirContrat();
       c2.saisirContrat();
       
       c.ajouterContrat(c1);
       c.ajouterContrat(c2);
       
       System.out.println(c1);
       
         
        
        
        
    }
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    
}
