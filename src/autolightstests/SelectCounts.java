/*
 * Select Camera counts from DB for computing
 * and to program the traffic lights
 */
package autolightstests;

import AutoLightsUI.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mido Austin
 */
public class SelectCounts {
    private static Connection con = new DBConnector().connect();
    
    public static void main(String args[]){
        
        int timId = 46;
        String movId = "J1-0";
        
        ArrayList<String> J1 = new ArrayList<String>();
        
        //get all counts
        for(int i =1; i<=12; i++){
            if(i<10){//get counts from Junction1-9
                movId = "J1-0"+i;
                J1.add(count(timId, movId));
            }else{ //get counts from Junction10-12
                movId = "J1-"+i;
                J1.add(count(timId, movId));
            }
            //System.out.println("int m"+i+" = Integer.getInteger(M"+i+");");
        }//end of for loop
        
        System.out.println(J1);
        //System.out.println(J1.get(0));
    }
    
    private static String count(int timeId ,String movId){
        
        String pass = "";
        String querry = "SELECT `total_veh_count` FROM `daily_counts` WHERE `time_id`=\""+timeId+"\" AND `movement_id`=\""+movId+"\" ";
        PreparedStatement pst;

        try {
            pst = con.prepareStatement(querry);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                pass = rs.getString("total_veh_count");
            }
            //System.out.println(pass);
        } catch (SQLException ex) {
            Logger.getLogger(SelectCounts.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return pass;
    }
    
    public SelectCounts(String M[]){
        int m1 = Integer.getInteger(M[1]);
        int m2 = Integer.getInteger(M[2]);
        int m3 = Integer.getInteger(M[3]);
        int m4 = Integer.getInteger(M[4]);
        int m5 = Integer.getInteger(M[5]);
        int m6 = Integer.getInteger(M[6]);
        int m7 = Integer.getInteger(M[7]);
        int m8 = Integer.getInteger(M[8]);
        int m9 = Integer.getInteger(M[9]);
        int m10 = Integer.getInteger(M[10]);
        int m11 = Integer.getInteger(M[11]);
        int m12 = Integer.getInteger(M[12]);
    }

}





/*
String queryMovId;
String queryTimId;

variables to hold individual movement counts
    int J1_1;   int J1_2;   int J1_3;
    int J1_4;   int J1_5;   int J1_6;
    int J1_7;   int J1_8;   int J1_9;
    int J1_10;  int J1_11;  int J1_12;*/
