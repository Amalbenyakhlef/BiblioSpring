/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBconn;

/**
 *
 * @author admin
*/

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conn {
    
    public Connection DBcnx()
    {
        try 
        {
            String url="jdbc:mysql://localhost:3306/vms";
            String username="root";
            String password=""; 
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection(url, username, password);
            //System.out.println("Connexion avec Succès !");
            return (Connection) conn;
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connexion échouée !");
            Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
    //static Statement statement = null;
    //PreparedStatement pst;
    //DbConnection cnx = DbConnection.getInstance();
    //java.sql.Connection connection = cnx.getConnection();
    
}
