/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autolightstests;

/**
 *
 * @author Mido Austin
 */
public class RNG {
    public static void main (String args[]){
        int time_id = 31;
        
        while(time_id<90){
        
            System.out.print("time : "+time_id);
            
            double num1 = Math.random()*800;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))/2;
                
            double num2 = Math.random()*200;
                String num3 = String.valueOf(num2);
                StringBuilder str2 = new StringBuilder(num3);
                int num4 = Integer.parseInt(str.substring(0,2))/6;

                System.out.println("   "+num+"   "+num4);
            
            time_id++;
        }    
    }
            
}

/*if(time>30 && time<=35){
                for(int i=0; i<5; i++){
                double num1 = Math.random()*1000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))*i/32;

                System.out.println(time+"   "+num);
                }
            }
            
            else if(time>36 && time<=40){
                for(int i=5; i<10; i++){
                double num1 = Math.random()*1000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))*i/24;

                System.out.println(time+"   "+num);
                }
            }
            else if(time>41 && time<=45){
                for(int i=10; i>5; i--){
                double num1 = Math.random()*1000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))*i/16;

                System.out.println(time+"   "+num);
                }
            }
        
            else if(time>46 && time<=50){
                for(int i=10; i>5; i--){
                double num1 = Math.random()*1000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))*i/16;

                System.out.println(time+"   "+num);
                }
            }
        
            else if(time>51 && time<=55){
                for(int i=5; i>0; i--){
                double num1 = Math.random()*1000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))*i/24;

                System.out.println(time+"   "+num);
                }
            }
        
            else if(time>56 && time<=60){
                for(int i=0; i<5; i++){
                double num1 = Math.random()*1000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))*i/32;

                System.out.println(time+"   "+num);
                }
            }
        
            else if(time>61 && time<=65){
                for(int i=5; i<10; i++){
                double num1 = Math.random()*1000;
                String num0 = String.valueOf(num1);
                StringBuilder str = new StringBuilder(num0);
                int num = Integer.parseInt(str.substring(0,2))*i/32;

                System.out.println(time+"   "+num);
                }
            }
            else{
                System.out.println("complete");
            }
*/