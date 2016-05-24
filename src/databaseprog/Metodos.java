/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseprog;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author Nabor
 */
public class Metodos {
    Connection conn=null;
    public Connection Conectar(){
        Connection conn=null;try{
            Class.forName("com.mysql.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/dogbd?user=root&password=Sobrada12345");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conn;
           
           
        
        
    }
}
    
