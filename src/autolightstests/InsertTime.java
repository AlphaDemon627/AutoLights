/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autolightstests;

import AutoLightsUI.DBConnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mido Austin
 */
public class InsertTime {
    
    
    public static void main (String args[]){
        int from1 = 00;
        int from2 = 0;
        Connection con =con = new DBConnector().connect();
        
        String id = "";
        
        int i=2;
        while( i!=120){
            
            //0-10hrs
           if(from1<10){
               if(from2<10){
                String slot = "0"+from1+":0"+from2+"-0"+from1+":"+(from2+14);
                //System.out.println(i+"  "+slot);
                String querry = "insert into time (time_id, time_slot) values (?,?)";   
                try {
                        PreparedStatement pst = con.prepareStatement(querry);
                        pst.setString(1,Integer.toString(i-1));
                        pst.setString(2,slot);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                    }
                
                from2=from2+15;
               }
               else if(from2<=45){
                String slot = "0"+from1+":"+from2+"-0"+from1+":"+(from2+14);
                //System.out.println(i+"   "+slot);
                String querry = "insert into time (time_id, time_slot) values (?,?)";   
                try {
                        PreparedStatement pst = con.prepareStatement(querry);
                        pst.setString(1,Integer.toString(i-1));
                        pst.setString(2,slot);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                    }
                
                from2=from2+15;
               }
               else{
               from1++;
               from2=0;
                }
               
            }
           //10-20hrs
           else if(from1<20){
               
                if(from2<10){
                String slot = from1+":0"+from2+"-"+from1+":"+(from2+14);
                //System.out.println(i+"   "+slot);
                String querry = "insert into time (time_id, time_slot) values (?,?)";   
                try {
                        PreparedStatement pst = con.prepareStatement(querry);
                        pst.setString(1,Integer.toString(i-1));
                        pst.setString(2,slot);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                    }
                
                from2=from2+15;
               }
               else if(from2<=45){
                String slot = from1+":"+from2+"-"+from1+":"+(from2+14);
                //System.out.println(i+"   "+slot);
                String querry = "insert into time (time_id, time_slot) values (?,?)";   
                try {
                        PreparedStatement pst = con.prepareStatement(querry);
                        pst.setString(1,Integer.toString(i-1));
                        pst.setString(2,slot);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                    }
                
                from2=from2+15;
               }
               else{
               from1++;
               from2=0;
                }
            }
           //20-24hrs
           else if(from1<=24){
               
                if(from2<10){
                String slot = from1+":0"+from2+"-"+from1+":"+(from2+14);
                //System.out.println(i+"   "+slot);
                String querry = "insert into time (time_id, time_slot) values (?,?)";   
                try {
                        PreparedStatement pst = con.prepareStatement(querry);
                        pst.setString(1,Integer.toString(i-1));
                        pst.setString(2,slot);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                    }
                
                from2=from2+15;
               }
               else if(from2<=45){
                String slot = from1+":"+from2+"-"+from1+":"+(from2+14);
                //System.out.println(i+"   "+slot);
                String querry = "insert into time (time_id, time_slot) values (?,?)";   
            try {
                    PreparedStatement pst = con.prepareStatement(querry);
                    pst.setString(1,Integer.toString(i-1));
                    pst.setString(2,slot);
                    pst.executeUpdate();
                    System.out.println("done");

                } catch (SQLException ex) {
                    System.out.println("Error" + ex.getMessage());
                }
                
                from2=from2+15;
               }
               else{
               from1++;
               from2=0;
                }
           }
           
           else{
           
           System.out.println(" proceed?");
           }
           
           i++;
        }
       
    }
    /*String querry = "insert into time (time_id, time_slot) values (?,?)";   
    try {
            PreparedStatement pst = con.prepareStatement(querry);
            pst.setString(1,id);
            pst.setString(2,slot);
            pst.executeUpdate();
            System.out.println("done");
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }*/
}
