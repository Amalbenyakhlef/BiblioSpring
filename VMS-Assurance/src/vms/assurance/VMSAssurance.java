package vms.assurance;
import java.text.ParseException;
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
      
         
        
        
        
    }
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    
}