/*
 *Simulation of count cameras at intersections
 *Data is inserted into db as no. of vehicles being counted
 */
package AutoLightsUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mido Austin
 */
public class CameraCounts {
    public static void main (String args[]){
        countCars(1);
    }
    public static void countCars(int id){
        Connection con = new DBConnector().connect();

            String move_id = "J1-0";
            int time = 31; 
            
            Date dat = new Date();
                
                SimpleDateFormat today = new SimpleDateFormat("EEEE");
            String day = today.format(dat);
            
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(dat);
            int hgv = 0;
            int lgv = 0;
            int ttl = hgv+lgv;
            int i = 1;
            
            
        //insert counts from 12 am. to 6 a.m
            for(int time_late = 1; time_late <30;time_late++){//specific time slot
             for(int ii = 1;ii<=12;ii++){//specific movements
                    if(ii<10){
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J"+id+"-0"+ii+"', '"+time_late+"', '"+day+"', '"+date+"', '0', '0', '0');";
                        try {
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.executeUpdate();
                            System.out.println("done");

                        } catch (SQLException ex) {
                            System.out.println("Error" + ex.getMessage());
                        }
                        //System.out.println(query);

                    }else{
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J"+id+"-"+ii+"', '"+time_late+"', '"+day+"', '"+date+"', '0', '0', '0');";
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
                try{
               Thread.sleep(10000);
               }catch(Exception ex){
                   ex.printStackTrace();
               }
            }
        
            
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
                    String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J"+id+"-0"+ii+"', '"+time+"', '"+day+"', '"+date+"', '"+lgv+"', '"+hgv+"', '"+ttl+"');";
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
                    query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J"+id+"-"+ii+"', '"+time+"', '"+day+"', '"+date+"', '"+lgv+"', '"+hgv+"', '"+ttl+"');";
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
                try{
                Thread.sleep(10000);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                time++;
            }
            
        //insert counts from 6 p.m. to 12 a.m
            for(int time_late = 91; time_late <120;time_late++){
             for(int iii = 1;iii<=12;iii++){
                    if(iii<10){
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J"+id+"-0"+iii+"', '"+time_late+"', '"+day+"', '"+date+"', '0', '0', '0');";
                        try {
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.executeUpdate();
                            System.out.println("done");

                        } catch (SQLException ex) {
                            System.out.println("Error" + ex.getMessage());
                        }
                        //System.out.println(query);

                    }else{
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J"+id+"-"+iii+"', '"+time_late+"', '"+day+"', '"+date+"', '0', '0', '0');";
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
                try{
                Thread.sleep(10000);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    
}
    
/*       public static void main(String args[]){
         for(int time_late = 91; time_late <120;time_late++){
             for(int iii = 1;iii<=12;iii++){
                    if(iii<10){
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-0"+iii+"', '"+time_late+"', 'Monday', '2018-10-02', '0', '0', '0');";
                        /*try {
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.executeUpdate();
                            System.out.println("done");

                        } catch (SQLException ex) {
                            System.out.println("Error" + ex.getMessage());
                        }
                        System.out.println(query);

                    }else{
                        String query = "INSERT INTO `daily_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-"+iii+"', '"+time_late+"', 'Monday', '2018-10-02', '0', '0', '0');";
                        /*try {
                            PreparedStatement pst = con.prepareStatement(query);
                            pst.executeUpdate();
                            System.out.println("done");

                        } catch (SQLException ex) {
                            System.out.println("Error" + ex.getMessage());
                        }
                        System.out.println(query);
                    }
                    System.out.println(time_late);
                }
        }
    }*/