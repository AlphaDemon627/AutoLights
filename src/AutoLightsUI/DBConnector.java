/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoLightsUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Mido Austin
 */
public class DBConnector {
    public  Connection connect(){
        //we initialize connection to null initially
        Connection db_connect = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Error: class not found:" + cnfe.getMessage());
        }
        //we then check if our jdbc driver is available
        try{
            db_connect = DriverManager.getConnection("jdbc:mysql://localhost/autolightsdb","root","");
        }catch(SQLException sqle){
            System.out.println("Error: " + sqle.getMessage());
        }
        if(db_connect != null){
            System.out.println("Connection successful");
            return db_connect;
        }else{
            System.out.println("An unknown error occured");
            return null;
        }
    }
    
    public  Connection connect2(){
        //we initialize connection to null initially
        Connection db_connect = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Error: class not found:" + cnfe.getMessage());
        }
        //we then check if our jdbc driver is available
        try{
            db_connect = DriverManager.getConnection("jdbc:mysql://localhost/autolightsdb2","root","");
        }catch(SQLException sqle){
            System.out.println("Error: " + sqle.getMessage());
        }
        if(db_connect != null){
            System.out.println("Connection successful");
            return db_connect;
        }else{
            System.out.println("An unknown error occured");
            return null;
        }
    }
    
    public  Connection connect3(){
        //we initialize connection to null initially
        Connection db_connect = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Error: class not found:" + cnfe.getMessage());
        }
        //we then check if our jdbc driver is available
        try{
            db_connect = DriverManager.getConnection("jdbc:mysql://localhost/events","root","");
        }catch(SQLException sqle){
            System.out.println("Error: " + sqle.getMessage());
        }
        if(db_connect != null){
            System.out.println("Connection successful");
            return db_connect;
        }else{
            System.out.println("An unknown error occured");
            return null;
        }
    }
    /**REMOVE LATER**/
    
    /**
     * @param args the command line arguments
     */
    public static void main (String [] args) {
        Connection connect;
        connect = new DBConnector().connect();
        
    }
    
}
