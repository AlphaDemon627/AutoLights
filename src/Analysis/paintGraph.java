/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analysis;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mido Austin
 */
public class paintGraph extends JPanel {
    public int junction;
    
    
    //GetDBData dbdata = new GetDBData(junction);

    int xAxisLength = 300; 
    int yAxisLength = 300;
    
    int xMargin = 80; int topMargin = 50;
    int yMargin = 75; int spcBtwn = 50;
   
    //test variables
    int height = 200;
    String day = "Wed";
    String time = "17:15 - 17:29";
    int timeId = 87;
    //set xbar positions
    int xMonday = xMargin + spcBtwn;   
    int xTuesday = 40+xMonday +spcBtwn;
    int xWednesday = 40+xTuesday +spcBtwn;      
    int xThursday = 40+xWednesday +spcBtwn;
    int xFriday = 40+xThursday +spcBtwn;
    int xSaturday = 40+xFriday +spcBtwn;
    
    //bar(height, x,y)
    Bar Monday = new Bar(GetDBData.count.get(0),xMonday,GetDBData.day.get(0));
    Bar Tuesday = new Bar(GetDBData.count.get(1),xTuesday,GetDBData.day.get(1));
    Bar Wednesday = new Bar(GetDBData.count.get(2),xWednesday,GetDBData.day.get(2));
    Bar Thursday = new Bar(GetDBData.count.get(3),xThursday,GetDBData.day.get(3));
    Bar Friday = new Bar(GetDBData.count.get(4),xFriday,GetDBData.day.get(4));
    Bar Saturday = new Bar(GetDBData.count.get(5),xSaturday,GetDBData.day.get(5));
    
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        //set title
        g.setColor(Color.CYAN);
        g.drawString("GRAPH OF VEHICLES COUNTED IN LAST WEEK FOR INTERSECTION : J"+junction, 180, 30);
        
        g.setColor(Color.green);
        g.drawString("time id : ("+timeId+") "+time, 300, 50);
        
        //set axis
        this.grapgBg(g);
        
        //set x-axis name.
        g.setColor(new Color(255,0,255));
        g.drawString("COUNTING DAYS", 330, 380);
        
        //set Y-axis name.
        g.setColor(new Color(255,0,255));
        g.drawString("NUMBER", 3, 180);
        g.drawString("OF VEH", 3, 190);
        g.drawString("COUNT", 3, 200);
        
        Monday.paintBar(g,getHeight()- yMargin-GetDBData.count.get(0));
        Tuesday.paintBar(g,getHeight()- yMargin-GetDBData.count.get(1));
        Wednesday.paintBar(g,getHeight()- yMargin-GetDBData.count.get(2));
        Thursday.paintBar(g,getHeight()- yMargin-GetDBData.count.get(3));
        Friday.paintBar(g,getHeight()- yMargin-GetDBData.count.get(4));
        Saturday.paintBar(g,getHeight()- yMargin-GetDBData.count.get(5));
        
        g.setColor(new Color(255,150,0));
        g.drawString("KEY", xMargin+this.xAxisLength*2+10, topMargin+this.yAxisLength-69);
        g.setColor(Color.yellow);
        g.drawString("00    Veh. Counted", xMargin+this.xAxisLength*2+10, topMargin+this.yAxisLength-54);
        g.fillRect(xMargin+this.xAxisLength*2+10, topMargin+this.yAxisLength-39, 40, 30);
        g.drawString("Counts", xMargin+this.xAxisLength*2+50, topMargin+this.yAxisLength-19);
    }
    
    public void grapgBg(Graphics g){
        g.setColor(Color.yellow);
        //g.drawLine(xstart, ystart, xend, yend);
        g.drawLine(xMargin, getHeight()-yMargin, getWidth()-xMargin, getHeight()-yMargin);//x-axis
        g.drawLine(xMargin, topMargin, xMargin, getHeight()-yMargin);//y-axis
        g.drawString("0", xMargin-7, getHeight()-yMargin+7);
        
        g.setColor(Color.yellow);
        for(int x=40; x<=yAxisLength; x=x+40){
            g.drawLine(xMargin-5, getHeight()-yMargin-x, xMargin, getHeight()-yMargin-x);
            g.drawString(String.valueOf(x), xMargin-28, 345-x);
        }
        
    }
}
