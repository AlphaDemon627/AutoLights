/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traffic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Mido Austin
 */
public class Lgv extends Vehicle{
    
    BufferedImage img = null;
    
    public Lgv(int newx, int newy) {
        super(newx, newy);
        width = 50;
        height = 30;
        speed = 8;
        
        try {
            img = ImageIO.read(new File("C:\\Users\\Mido Austin\\Documents\\NetBeansProjects\\AutoLights\\bettle.png"));
        } catch (IOException e) {
        }
    }
    
    
    public void paintVeh(Graphics g){
        g.setColor(Color.GREEN);
        //g.fillRect(x, y, width, height);
        g.drawImage(img, x, y, width, height, null);
    }
}
