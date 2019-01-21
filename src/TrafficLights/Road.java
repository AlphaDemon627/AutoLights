/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrafficLights;

import Compute.SelectCounts;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Mido Austin
 */
public class Road extends JPanel {
    //to position each traffic light
    Light J1_1 = new Light(39, 179);
    Light J1_2 = new Light(251, 119);
    Light J1_3 = new Light(251, 331);
    Light J1_4 = new Light(99, 331);
    
    Light J2_1 = new Light(839, 179);
    Light J2_2 = new Light(1051, 119);
    Light J2_3 = new Light(1051, 331);
    Light J2_4 = new Light(899, 331);
    
    
    int VERTICAL_J1 = 130;
    int VERTICAL_J2 = 930;
    int HORIZONTAL_POST = 210;
    public int ROAD_WIDTH = 120;
    int LANE_LENGHT = 20;
    int lightPosition;
    int run = 0;
    
    String j1_1 = "null";    String j1_2 = "null";   String j1_3 = "null";     String j1_4 = "null";
    String j2_1 = "null";    String j2_2 = "null";   String j2_3 = "null";     String j2_4 = "null";
    
    String timer_j1 = "00";
    String timer_j2 = "00";
    
    Timer timer;
    Graphics g;

    public void setLightPosition(int newlightPosition) {
        lightPosition = newlightPosition;
    }
    
    Thread t = new Thread();
    
    @Override
    public void paintComponent(final Graphics g){
        super.paintComponent(g);
        this.paintRoad(g);
        
        if(lightPosition == 0){
            this.setYellow(g);
        
        }else if(lightPosition == 1){
           this.set1green(g);
        }else if(lightPosition == 2){
           this.set2green(g);
        }else if(lightPosition == 3){
           this.set3green(g);
        }else if(lightPosition == 4){
           this.set4green(g);
        }else{
            this.setOff(g);
        }
        
        this.setVehicleCount(g,j1_1,j1_2,j1_3,j1_4,
                                j2_1,j2_2,j2_3,j2_4);
        
        this.setTimer(g, timer_j1, timer_j2);
        
        this.repaint();
    }
    public void paintRoad(Graphics g){
        //back ground
        g.setColor(new Color(2,117,21));
        g.fillRect(0, 0, getWidth(), getHeight());
        
        //first intersection, bunyala
        g.setColor(Color.BLACK);
        g.fillRect(VERTICAL_J1, 0, ROAD_WIDTH, getHeight());
            
        g.setColor(Color.WHITE);
        for(int b = VERTICAL_J1+20; b <=VERTICAL_J1+40; b=b+20){
            for(int a=0; a <= getHeight(); a=a+40){
                    g.drawLine(b, a, b, a+20);
                }
        }
        g.setColor(Color.YELLOW);
        g.drawLine(VERTICAL_J1+60, 0, VERTICAL_J1+60, this.getHeight());
        
        g.setColor(Color.WHITE);
        for(int b = VERTICAL_J1+80; b <=VERTICAL_J1+100;b=b+20){
            for(int a=0; a <= getWidth(); a=a+40){
                g.drawLine(b, a, b, a+20);
            }
        }
        
        //second intersection, Haille Selassie
        g.setColor(Color.BLACK);
        g.fillRect(VERTICAL_J2, 0, ROAD_WIDTH, getHeight());
        g.setColor(Color.WHITE);
        
        g.setColor(Color.WHITE);
        for(int b = VERTICAL_J2+20; b <=VERTICAL_J2+40;b=b+20){
            for(int a=0; a <= getHeight(); a=a+40){
                    g.drawLine(b, a, b, a+20);
                }
        }
        g.setColor(Color.YELLOW);
        g.drawLine(VERTICAL_J2+60, 0, VERTICAL_J2+60, this.getHeight());
        
        g.setColor(Color.WHITE);
        for(int b = VERTICAL_J2+80; b <=VERTICAL_J2+100;b=b+20){
            for(int a=0; a <= getWidth(); a=a+40){
                g.drawLine(b, a, b, a+20);
            }
        }
        
        //road from Bunyala to Haille Selassie
        g.setColor(Color.BLACK);
        g.fillRect(0, HORIZONTAL_POST, this.getWidth(), ROAD_WIDTH);
        
        g.setColor(Color.WHITE);
        for(int b = HORIZONTAL_POST+20; b <=HORIZONTAL_POST+40; b=b+20){
            for(int a=0; a <= getWidth(); a=a+40){
                g.drawLine(a, b, a+20, b);
            }
        }
            g.setColor(Color.YELLOW);
            g.drawLine(0, HORIZONTAL_POST+60, this.getWidth(), HORIZONTAL_POST+60);
        g.setColor(Color.WHITE);
        for(int b = HORIZONTAL_POST+80; b <=HORIZONTAL_POST+100;b=b+20){
            for(int a=0; a <= getWidth(); a=a+40){
                g.drawLine(a, b, a+20, b);
            }
        }
        
        //junction 1
        g.setColor(Color.black);
        g.fillRect(VERTICAL_J1, HORIZONTAL_POST, 120, 120);
        
        //junction 2
        g.setColor(Color.black);
        g.fillRect(VERTICAL_J2, HORIZONTAL_POST, 120, 120);
        
    } 
    //set movement 1, 2 and 3 lights green
    public void set1green(Graphics g){
        J1_1.paintTrafficLightHorizontal(g,"green");
        J1_2.paintTrafficLightVertical(g,"red");
        J1_3.paintTrafficLightHorizontal(g,"red");
        J1_4.paintTrafficLightVertical(g,"red");
        
        J2_1.paintTrafficLightHorizontal(g,"red");
        J2_2.paintTrafficLightVertical(g,"green");
        J2_3.paintTrafficLightHorizontal(g,"red");
        J2_4.paintTrafficLightVertical(g,"red");
    }
    //set movement 4, 5 and 6 lights green
    public void set2green(Graphics g){
        J1_1.paintTrafficLightHorizontal(g,"red");
        J1_2.paintTrafficLightVertical(g,"green");
        J1_3.paintTrafficLightHorizontal(g,"red");
        J1_4.paintTrafficLightVertical(g,"red");
        
        J2_1.paintTrafficLightHorizontal(g,"red");
        J2_2.paintTrafficLightVertical(g,"red");
        J2_3.paintTrafficLightHorizontal(g,"green");
        J2_4.paintTrafficLightVertical(g,"red");
    }
    //set movement 7, 8 and 9 lights green
    public void set3green(Graphics g){
        J1_1.paintTrafficLightHorizontal(g,"red");
        J1_2.paintTrafficLightVertical(g,"red");
        J1_3.paintTrafficLightHorizontal(g,"green");
        J1_4.paintTrafficLightVertical(g,"red");
        
        J2_1.paintTrafficLightHorizontal(g,"red");
        J2_2.paintTrafficLightVertical(g,"red");
        J2_3.paintTrafficLightHorizontal(g,"red");
        J2_4.paintTrafficLightVertical(g,"green");
    }
    //set movement 10, 11 and 12 lights green
    public void set4green(Graphics g){
        J1_1.paintTrafficLightHorizontal(g,"red");
        J1_2.paintTrafficLightVertical(g,"red");
        J1_3.paintTrafficLightHorizontal(g,"red");
        J1_4.paintTrafficLightVertical(g,"green");
        
        J2_1.paintTrafficLightHorizontal(g,"green");
        J2_2.paintTrafficLightVertical(g,"red");
        J2_3.paintTrafficLightHorizontal(g,"red");
        J2_4.paintTrafficLightVertical(g,"red");
    }
    //set all lights yellow
    public void setYellow(Graphics g){
        
        J1_1.paintTrafficLightHorizontal(g,"yellow");
        J1_2.paintTrafficLightVertical(g,"yellow");
        J1_3.paintTrafficLightHorizontal(g,"yellow");
        J1_4.paintTrafficLightVertical(g,"yellow");
                
        J2_1.paintTrafficLightHorizontal(g,"yellow");
        J2_2.paintTrafficLightVertical(g,"yellow");
        J2_3.paintTrafficLightHorizontal(g,"yellow");
        J2_4.paintTrafficLightVertical(g,"yellow");
        
        repaint();
    }
    //set all lights off
    public void setOff(Graphics g){
        J1_1.paintTrafficLightHorizontal(g,"off");
        J1_2.paintTrafficLightVertical(g,"off");
        J1_3.paintTrafficLightHorizontal(g,"off");
        J1_4.paintTrafficLightVertical(g,"off");
        
        J2_1.paintTrafficLightHorizontal(g,"off");
        J2_2.paintTrafficLightVertical(g,"off");
        J2_3.paintTrafficLightHorizontal(g,"off");
        J2_4.paintTrafficLightVertical(g,"off");
        
    }
    //show number of vehicles
    public void setVehicleCount(Graphics g, String j1_1, String j1_2, String j1_3, String j1_4,
    String j2_1,String j2_2,String j2_3,String j2_4){
        
        g.setColor(Color.yellow);
        g.drawString(j1_1, VERTICAL_J1-60, 177);
        g.drawString(j1_2, VERTICAL_J1+125, HORIZONTAL_POST-95);
        g.drawString(j1_3, VERTICAL_J1+150, HORIZONTAL_POST+162);
        g.drawString(j1_4, VERTICAL_J1-30 , HORIZONTAL_POST+222);
        g.drawString(j2_1, VERTICAL_J2-60, 177);
        g.drawString(j2_2, VERTICAL_J2+125, HORIZONTAL_POST-97);
        g.drawString(j2_3, VERTICAL_J2+150, HORIZONTAL_POST+162);
        g.drawString(j2_4, VERTICAL_J2-30 , HORIZONTAL_POST+222);
    }
    //show timer
    public void setTimer(Graphics g, String j1, String j2){
        g.setColor(Color.white);
        g.drawString(j1, VERTICAL_J1+54, 277);
        g.drawString(j2, VERTICAL_J2+54, HORIZONTAL_POST+67);
    }
    
    //set numbers from db to string
    public void setNumber(int newj1_1, int newj1_2, int newj1_3, int newj1_4,
    int newj2_1,int newj2_2,int newj2_3,int newj2_4){
        j1_1 = Integer.toString(newj1_1);
        j1_2 = Integer.toString(newj1_2);
        j1_3 = Integer.toString(newj1_3);
        j1_4 = Integer.toString(newj1_4);

        j2_1 = Integer.toString(newj2_1);
        j2_2 = Integer.toString(newj2_2);
        j2_3 = Integer.toString(newj2_3);
        j2_4 = Integer.toString(newj2_4);
    }
    
    
    
    public Road(int newLightPosition) {
        lightPosition = newLightPosition;
        
    }
}
/*public Road() {
        
        J1_1.paintTrafficLight(g,"yellow");
        J1_2.paintTrafficLight(g,"yellow");
        J1_3.paintTrafficLight(g,"yellow");
        J1_4.paintTrafficLight(g,"yellow");
        
        J2_1.paintTrafficLight(g,"yellow");
        J2_2.paintTrafficLight(g,"yellow");
        J2_3.paintTrafficLight(g,"yellow");
        J2_4.paintTrafficLight(g,"yellow");
        
    }*/

//traffic light
        /*
        J1_1.paintTrafficLight(g,c);
        J1_2.paintTrafficLight(g,c);
        J1_3.paintTrafficLight(g,c);
        J1_4.paintTrafficLight(g,c);
        
        J2_1.paintTrafficLight(g,c);
        J2_2.paintTrafficLight(g,c);
        J2_3.paintTrafficLight(g,c);
        J2_4.paintTrafficLight(g,c);*/
        