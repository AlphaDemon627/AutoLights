package TrafficLightsFail1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Road extends JPanel{
    int VERTICAL_J1 = 130;
    int VERTICAL_J2 = 930;
    int HORIZONTAL_POST = 210;
    public int ROAD_WIDTH = 120;
    int LANE_LENGHT = 20;
    int lightPosition;
    
    public void paintComponent(Graphics g){
        paintRoad(g);
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
}
