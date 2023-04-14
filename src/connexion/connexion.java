/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class connexion {
    
    Connection connection;
    
    public connexion(){
        
    }
    
    public Connection bdd(){
        try {

            Class.forName("org.sqlite.JDBC");

            connection = DriverManager.getConnection("jdbc:sqlite:./database/assurance.db");

            /*Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://38.17.53.106:19851/assurance?characterEncoding=UTF-8";
            String user = "admin";
            String password = "BmnUSN0T";

            connection = DriverManager.getConnection(url,user,password);*/

        } catch (Exception e) {

            e.printStackTrace();

        }
        
        return connection;
    }
    
}
