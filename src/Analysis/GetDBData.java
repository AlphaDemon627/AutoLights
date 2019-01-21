/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analysis;

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
public class GetDBData {
    static int[] counts = {100};
    public static ArrayList <String> day = new ArrayList(100);
    public static ArrayList <Integer> count = new ArrayList(100);
    public static ArrayList <String> time = new ArrayList(100);
    
    public GetDBData(int j){
        count.clear();
        fetchData(j);
    }
   
    public void fetchData(int i){
        Connection con = new DBConnector().connect();
        int j = i;

        //for(int a=1; a<19; a=a+3)
        while(j<19){
            //add days
            String querry = "SELECT `day` FROM `highest_counts` WHERE entry_id= "+j+" "; 
            PreparedStatement pst;
            try {
                pst = con.prepareStatement(querry);
                ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                     day.add(rs.getString("day").substring(0, 3));
                    }
                //System.out.println(day.get(a));
            } catch (SQLException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }

            //add total_veh_count
            String querry2 = "SELECT `total_veh_count` FROM `highest_counts` WHERE entry_id="+j+";"; 
            PreparedStatement pst2;
            try {
                pst2 = con.prepareStatement(querry2);
                ResultSet rs2 = pst2.executeQuery();
                    while(rs2.next()){
                    count.add(Integer.decode(rs2.getString("total_veh_count")));
                    }
                //System.out.println(counts[a]);
            } catch (SQLException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            j=j+3;
        }
    }
    
    public void timeId(){
        Connection con = new DBConnector().connect();
        int j = 1;

        //for(int a=1; a<19; a=a+3)
        while(j<19){
            //add days
            String querry = "SELECT `time_id` FROM `highest_counts` WHERE entry_id= "+j+" "; 
            PreparedStatement pst;
            try {
                pst = con.prepareStatement(querry);
                ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                     time.add(rs.getString("time_id"));
                    }
                //System.out.println(day.get(a));
            } catch (SQLException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String args[]){
        GetDBData dbdata = new GetDBData(3);
        dbdata.fetchData(3);
        dbdata.timeId();
        //System.out.println(day);
        //System.out.println(count);
        System.out.println(time);
    }
}
 
    