/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VOTE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harpreet
 */
public class MyVote {
     Connection con;
    public Connection getCon() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voting_system", "root", "root");
        }
        catch(ClassNotFoundException ex){
           Logger.getLogger(MyVote.class.getName()).log(Level.SEVERE, null, ex);  
        }catch (SQLException ex) {
            Logger.getLogger(MyVote.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return con;
    }
    
}
