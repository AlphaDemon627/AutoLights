/*
 * Select Camera counts from DB for computing
 * and to program the traffic lights
 */
package Compute;

import AutoLightsUI.DBConnector;
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
public class SelectCounts {
    int timeId = 46;
    String movId = "J1-0";
    int juncId = 1; 
    
    ArrayList<String> Counts = new ArrayList<String>();
    
    public SelectCounts(int newtimeId, int newjuncId) {
        timeId = newtimeId;
        juncId = newjuncId;
    }
    
    private Connection con = new DBConnector().connect();
    //to query data from from database
    public String count(){
        
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
    //to fetch all data and save it into array
    public ArrayList<String> getCounts(){
        
        //get all counts
        for(int i =1; i<=12; i++){
            if(i<10){//get counts from Junction1-9
                movId = "J"+juncId+"-0"+i;
                Counts.add(count());
            }else{ //get counts from Junction10-12
                movId = "J"+juncId+"-"+i;
                Counts.add(count());
            }
        }//end of for loop
        return Counts;
    }
    
    public int VehIn1(){
        int vehIn1 = 0;
        this.getCounts();
        vehIn1 = Integer.decode(Counts.get(1)) + Integer.decode(Counts.get(2));
        return vehIn1;
    }
    
    public int VehIn2(){
        int vehIn2 = 0;
        this.getCounts();
        vehIn2 = Integer.decode(Counts.get(4)) + Integer.decode(Counts.get(5));
        return vehIn2;
    }
    
    public int VehIn3(){
        int vehIn3 = 0;
        this.getCounts();
        vehIn3 = Integer.decode(Counts.get(7)) + Integer.decode(Counts.get(8));
        return vehIn3;
    }
    
    public int VehIn4(){
        int vehIn4 = 0;
        this.getCounts();
        vehIn4 = Integer.decode(Counts.get(10)) + Integer.decode(Counts.get(11));
        return vehIn4;
    }
}

    /*public static void main(String args[]){
        
        SelectCounts select = new SelectCounts();
        System.out.println(select.VehIn1());
        System.out.println(select.VehIn2());
        System.out.println(select.VehIn3());
        System.out.println(select.VehIn4());
   
    }*/
    