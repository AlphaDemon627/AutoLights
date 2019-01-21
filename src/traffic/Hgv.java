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
public class Hgv extends Vehicle{

    BufferedImage img = null;
    
    public Hgv(int newx, int newy) {
        super(newx, newy);
        width = 100;
        height = 40;
        speed = 7;
        
        try {
            img = ImageIO.read(new File("C:\\Users\\Mido Austin\\Documents\\NetBeansProjects\\AutoLights\\truck2.png"));
        } catch (IOException e) {
        }
    }
    
    
    public void paintVeh(Graphics g){
        g.setColor(Color.blue);
        //g.fillRect(x, y, width, height);
        g.drawImage(img, x, y, width, height, null);
    }
}
