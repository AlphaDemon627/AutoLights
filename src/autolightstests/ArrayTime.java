/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autolightstests;

import AutoLightsUI.DBConnector;
import AutoLightsUI.LogIn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mido Austin
 */
public class ArrayTime {
    Connection con = new DBConnector().connect();
    String pass;
    String time_slot;
    
    ArrayList <String> time = new ArrayList();
            
    public static void main (String args[]){
        ArrayTime at = new ArrayTime();
        at.fillArray();
        System.out.println(at.time.size());
    }
    public void fillArray(){
        for(int a = 31; a <90; a++){
            
                time_slot = password(a);
                for(int i=0; i<12;i++){
                time.add(time_slot);
                
            }
        }
    }
    public String password(int time){
        String querry = "SELECT time_slot FROM time WHERE time_id="+time+";";
        Connection con;
        pass="";
        con = new DBConnector().connect();
        
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(querry);
            ResultSet rs = pst.executeQuery();
                while(rs.next()){
                 pass = rs.getString("time_slot");
                }
            System.out.println(pass);
            return pass;
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
}
