/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autolightstests;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mido Austin
 */
public class SleepInLoop {
    
   static Date date = new Date();
   static SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
   
   public static void main (String Args[]){
       String sleep = "sleeping ";
       for(int a = 0; a<10; a++){
           System.out.println(sleep + a);
           System.out.println(sdf.format(date));
           
           try{
            Thread.sleep(10000);
            }catch(Exception ex){
                ex.printStackTrace();
            }
       }
   } 
}
