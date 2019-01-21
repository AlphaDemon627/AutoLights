/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrafficLightsFail1;

import java.awt.Color;
import java.awt.Graphics;
import java.sql.Array;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Mido Austin
 */
public class Light extends JPanel{

    int x;
    int y;
    final int height = 90;
    final int width = 30;
    final int diameter = 24;
    
    int ri = 100;    int rii = 100;   int riii = 100;
    int yi = 100;    int yii = 100;   int yiii = 100;
    int gi = 100;    int gii = 100;   int giii = 100;
    
    public Light(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //for vertical traffic lights
    public void paintTrafficLightVertical(Graphics g, String color){
        
       g.setColor(Color.black);
       g.fillRect(x, y, width, height);
       
       g.setColor(new Color(ri, rii, riii));//color red
       g.fillOval(x+2, y+2, diameter, diameter);
       
       
       g.setColor(new Color(yi, yii, yiii));//color yellow
       g.fillOval(x+2, y+32, diameter, diameter);//
       
       g.setColor(new Color(gi, gii, giii));//color green
       g.fillOval(x+2, y+62, diameter, diameter);
        
       if (color == "red"){
           this.setRed(g);
       }
       else if(color == "yellow"){
           this.setYellow(g); 
       } 
       else if(color == "green"){
           this.setGreen(g);
       } 
    }
    
    public void paintTrafficLightHorizontal(Graphics g, String color){
        
       /*g.setColor(Color.black);
       g.fillRect(x, y, height, width);
       
       g.setColor(new Color(255, 150, 150));//color green
       g.fillOval(x+62, y+2, diameter, diameter);
       
       g.setColor(new Color(255, 255, 200));//color yellow
       g.fillOval(x+32, y+2, diameter, diameter);//
       
       g.setColor(new Color(150, 200, 150));//color red
       g.fillOval(x+2, y+2, diameter, diameter);
       */
       if (color == "red"){
           this.setRedHorizontal(g);
       }
       else if(color == "yellow"){
           this.setYellowHorizontal(g); 
       } 
       else if(color == "green"){
           this.setGreenHorizontal(g);
       }
       else if(color == "off"){
           this.setOff(g);
       }
    }
    
    public void setRed(Graphics g){
       g.setColor(Color.black);
       g.fillRect(x, y, width, height);
       
       g.setColor(Color.red);//color red
       g.fillOval(x+2, y+2, diameter, diameter);
       
       
       g.setColor(new Color(yi, yii, yiii));//color yellow
       g.fillOval(x+2, y+32, diameter, diameter);//
       
       g.setColor(new Color(gi, gii, giii));//color green
       g.fillOval(x+2, y+62, diameter, diameter);
    }
    
    public void setRedHorizontal(Graphics g){
       g.setColor(Color.black);
       g.fillRect(x, y, width+60, height-60);
       
       g.setColor(Color.red);//color red
       g.fillOval(x+2, y+2, diameter, diameter);
       
       
       g.setColor(new Color(yi, yii, yiii));//color yellow
       g.fillOval(x+32, y+2, diameter, diameter);//
       
       g.setColor(new Color(gi, gii, giii));//color green
       g.fillOval(x+62, y+2, diameter, diameter);
    }
    
    public void setYellow(Graphics g){
        g.setColor(Color.black);
       g.fillRect(x, y, width, height);
       
        g.setColor(new Color(ri, rii, riii));//color red
       g.fillOval(x+2, y+2, diameter, diameter);
       
       
       g.setColor(Color.YELLOW);//color yellow
       g.fillOval(x+2, y+32, diameter, diameter);//
       
       g.setColor(new Color(gi, gii, giii));//color green
       g.fillOval(x+2, y+62, diameter, diameter);
    }
    
    public void setYellowHorizontal(Graphics g){
        g.setColor(Color.black);
       g.fillRect(x, y, width+60, height-60);
       
        g.setColor(new Color(ri, rii, riii));//color red
       g.fillOval(x+2, y+2, diameter, diameter);
       
       
       g.setColor(Color.YELLOW);//color yellow
       g.fillOval(x+32, y+2, diameter, diameter);//
       
       g.setColor(new Color(gi, gii, giii));//color green
       g.fillOval(x+62, y+2, diameter, diameter);
    }
    
    public void setGreen(Graphics g){
        g.setColor(Color.black);
       g.fillRect(x, y, width, height);
       
       g.setColor(new Color(ri, rii, riii));//color red
       g.fillOval(x+2, y+2, diameter, diameter);
       
       
       g.setColor(new Color(yi, yii, yiii));//color yellow
       g.fillOval(x+2, y+32, diameter, diameter);//
       
       g.setColor(Color.green);//color green
       g.fillOval(x+2, y+62, diameter, diameter);
    }
    
    public void setGreenHorizontal(Graphics g){
        g.setColor(Color.black);
       g.fillRect(x, y, width+60, height-60);
       
       g.setColor(new Color(ri, rii, riii));//color red
       g.fillOval(x+2, y+2, diameter, diameter);
       
       
       g.setColor(new Color(yi, yii, yiii));//color yellow
       g.fillOval(x+32, y+2, diameter, diameter);//
       
       g.setColor(Color.green);//color green
       g.fillOval(x+62, y+2, diameter, diameter);
    }
     
    public void setOff(Graphics g){
       g.setColor(Color.black);
       g.fillRect(x, y, height, width);
       
       g.setColor(new Color(255, 150, 150));//color green
       g.fillOval(x+62, y+2, diameter, diameter);
       
       g.setColor(new Color(255, 255, 200));//color yellow
       g.fillOval(x+32, y+2, diameter, diameter);//
       
       g.setColor(new Color(150, 200, 150));//color red
       g.fillOval(x+2, y+2, diameter, diameter);
    }
}
 /*if statement for color*/

/*
    */