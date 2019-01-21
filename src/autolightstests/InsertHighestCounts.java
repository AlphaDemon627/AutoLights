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
public class InsertHighestCounts {
    public static void main (String args[]){
        Connection con = new DBConnector().connect();

            String move_id = "J1-0";
            int time = 31; 
            String day = "Saturday";
            String date = "2018-10-6";
            int hgv = 0;
            int id = 0;
            int id2 = 0;
            int lgv = 0;
            int ttl = hgv+lgv;
            int i = 1;
            
            for(int a=0; a<6; a++){
            while(i<=3){
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
                
                if((ttl = hgv+lgv)<70 &&(ttl = hgv+lgv)<40){
                    lgv = (lgv*2);
                    hgv = (hgv*2);
                    ttl = hgv+lgv;
                }else if((ttl = hgv+lgv)<40 &&(ttl = hgv+lgv)<20){
                    lgv = (lgv*3);
                    hgv = (hgv*3);
                    ttl = hgv+lgv;
                }else if((ttl = hgv+lgv)<20 &&(ttl = hgv+lgv)<10){
                    lgv = (lgv*4);
                    hgv = (hgv*4);
                    ttl = hgv+lgv;
                }else if((ttl = hgv+lgv)<10 &&(ttl = hgv+lgv)<5){
                    lgv = (lgv*6);
                    hgv = (hgv*6);
                    ttl = hgv+lgv;
                }else if((ttl = hgv+lgv)<5){
                    lgv = (lgv*12);
                    hgv = (hgv*6);
                    ttl = hgv+lgv;
                }else if((ttl = hgv+lgv)<3){
                    lgv = (lgv*24);
                    hgv = (hgv*6);
                    ttl = hgv+lgv;
                }
                
                double id1 = Math.random()*90000;
                String id3 = String.valueOf(id1);
                StringBuilder str3 = new StringBuilder(id3);
                int id4 = Integer.parseInt(str.substring(0,2));
                id = id4;
                
                if(id%2!=0){
                    if(id<40 && id>30){
                        id=id+20;
                    }else if(id<30 && id>20){
                        id=id+30;
                    }else if(id<20 && id>10){
                        id=id+40;
                    }else if(id<10 && id>5){
                        id=id+50;
                    }else if(id<5){
                        id=id+60;
                    }
                }else{
                    double id12 = Math.random()*90000;
                    String id32 = String.valueOf(id12);
                    StringBuilder str32 = new StringBuilder(id32);
                    int id42 = Integer.parseInt(str.substring(0,2));
                    id2 = id42;
                    
                    if(id<40 && id>30){
                        id=id+20;
                    }else if(id<30 && id>20){
                        id=id+30;
                    }else if(id<20 && id>10){
                        id=id+40;
                    }else if(id<10 && id>5){
                        id=id+50;
                    }else if(id<5){
                        id=id+60;
                    }
                }
                
                String query = "INSERT INTO `highest_counts` (`movement_id`, `time_id`, `day`, `date`, `hgv_count`, `lgv_count`, `total_veh_count`) VALUES ('J1-0"+i+"', '"+id+"', '"+day+"', '"+date+"', '"+lgv+"', '"+hgv+"', '"+ttl+"');";
                    try {
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeUpdate();
                        System.out.println("done");

                    } catch (SQLException ex) {
                        System.out.println("Error" + ex.getMessage());
                        }
                    System.out.println(id+" : "+lgv+" "+hgv+" "+ttl);
                i++;
            }//end of while loop
            }//end of for loop
    }
}
