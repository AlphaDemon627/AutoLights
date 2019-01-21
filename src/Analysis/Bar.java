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
public class Bar extends JPanel{
    
    final int width = 60;
    int height;
    int xPosition;
    String day;

    public Bar(int newHeight, int newxPosition, String newDay) {
        height = newHeight;
        xPosition = newxPosition;
        day = newDay;
    }
    
    public void paintBar(Graphics g, int yposition){
        //bar
        g.setColor(new Color(255, 255, 140));
        g.fillRect(xPosition, yposition-1, width, height);
        //days
        g.setColor(Color.yellow);
        g.drawString(day, xPosition+15, yposition+height+17);
        //counts
        g.setColor(new Color(250, 250, 170));
        g.drawString(Integer.toString(height), xPosition+18, yposition-2);
    }
    
    public void setDay(Graphics g, int yposition){
        g.setColor(Color.black);
        g.drawString(day, xPosition+15, yposition+height+15);
    }
}
/*
    g.setColor(Color.black);
    g.drawString("Monday", xPosition, yposition);
*/