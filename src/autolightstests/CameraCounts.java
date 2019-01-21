/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autolightstests;

import AutoLightsUI.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mido Austin
 */
public class CameraCounts {
    
        public static void main (String args[]){
        Connection con = new DBConnector().connect();

            String move_id = "J1-0";
            int time = 31; 
            String day = "Monday";
            String date = "2018-10-1";
            int hgv = 0;
            int lgv = 0;
            int ttl = hgv+lgv;
            int i = 1;
            
         /*   
        //insert counts from 12 am. to 6 a.m
            for(int time_late = 1; time_late <30;time_late++){
             for(int ii = 1;ii<=12;ii++){
                    if(ii<10){
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-0"+ii+"', '"+time_late+"', '"+day+"', '"+date+"', '0', '0', '0');";
                        try {
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.executeUpdate();
                            System.out.println("done");

                        } catch (SQLException ex) {
                            System.out.println("Error" + ex.getMessage());
                        }
                        //System.out.println(query);

                    }else{
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-"+ii+"', '"+time_late+"', '"+day+"', '"+date+"', '0', '0', '0');";
                        try {
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.executeUpdate();
                            System.out.println("done");

                        } catch (SQLException ex) {
                            System.out.println("Error" + ex.getMessage());
                        }
                        //System.out.println(query);
                    }
                    System.out.println(time_late);
                }
        }
        */
            
        //insert counts from 6 am. to 6 p.m
        while(time!=90){
                
                 for(int ii=1; ii!=13; ii++){
                    //System.out.print("time : "+time_id);
            if(ii<10){
                double num1 = Math.random()*80000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))/2;
                lgv = num;
                
                double num2 = Math.random()*20000;
                String num3 = String.valueOf(num2);
                StringBuilder str2 = new StringBuilder(num3);
                int num4 = Integer.parseInt(str.substring(0,2))/6;
                hgv = num4;
                
                ttl = hgv+lgv;
                //insert to db from 6 a.m to 6 p.m
                    
                    //String query = "'J1-0"+i+"',  '"+time+"',  'Monday',  '2018-10-02',  '"+lgv+"',  '"+hgv+"',  '"+ttl+"'";
                    String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-0"+ii+"', '"+time+"', '"+day+"', '"+date+"', '"+lgv+"', '"+hgv+"', '"+ttl+"');";
                    try {
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                        }
                    System.out.println(query);
                       
                    }
            else{
                 double num1 = Math.random()*80000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))/2;
                lgv = num;
                
                double num2 = Math.random()*20000;
                String num3 = String.valueOf(num2);
                StringBuilder str2 = new StringBuilder(num3);
                int num4 = Integer.parseInt(str.substring(0,2))/6;
                hgv = num4;
                
                ttl = hgv+lgv;
                //insert to db from 6 a.m to 6 p.m
                    
                    String query = "'J1-0"+i+"',  '"+time+"',  'Monday',  '2018-10-02',  '"+lgv+"',  '"+hgv+"',  '"+ttl+"'";
                    query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-"+ii+"', '"+time+"', '"+day+"', '"+date+"', '"+lgv+"', '"+hgv+"', '"+ttl+"');";
                    try {
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                        }
                    System.out.println(query);
                               
                    }
                }
                time++;
            }
            /*
        //insert counts from 6 p.m. to 12 a.m
            for(int time_late = 91; time_late <120;time_late++){
             for(int iii = 1;iii<=12;iii++){
                    if(iii<10){
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-0"+iii+"', '"+time_late+"', '"+day+"', '"+date+"', '0', '0', '0');";
                        try {
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.executeUpdate();
                            System.out.println("done");

                        } catch (SQLException ex) {
                            System.out.println("Error" + ex.getMessage());
                        }
                        //System.out.println(query);

                    }else{
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-"+iii+"', '"+time_late+"', '"+day+"', '"+date+"', '0', '0', '0');";
                        try {
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.executeUpdate();
                            System.out.println("done");

                        } catch (SQLException ex) {
                            System.out.println("Error" + ex.getMessage());
                        }
                        //System.out.println(query);
                    }
                    System.out.println(time_late);
                }
            }*/
        }
    }


/*while (i<=7){
                if(i==7){
                    i=0;
                    time_id++;
                }else{
                    String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-0"+i+"', '"+time_id+"', 'Monday', '2018-10-02', '0', '0', '0');";
                    try {
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                    }
                }
                    
                if(time_id!=120){
                i++;
                }else
                {i=8;}
            }    
        }
*/

/*


 for(int i=1; i!=7; i++){
                    //System.out.print("time : "+time_id);
                double num1 = Math.random()*800;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))/2;
                lgv = num;
                
                double num2 = Math.random()*200;
                String num3 = String.valueOf(num2);
                StringBuilder str2 = new StringBuilder(num3);
                int num4 = Integer.parseInt(str.substring(0,2))/6;
                hgv = num4;
                
                ttl = hgv+lgv;
                //System.out.println("   "+num);
                    
                    String query = "'J1-0"+i+"',  '"+time_id+"',  'Monday',  '2018-10-02',  '"+lgv+"',  '"+hgv+"',  '"+ttl+"'";
                    /*query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-0"+i+"', '"+time_id+"', 'Monday', '2018-10-02', '"+lgv+"', '"+hgv+"', '"+ttl+"');";
                    try {
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                        }*
                    System.out.println(query);
                       
                    }*/