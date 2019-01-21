/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traffic;

import java.awt.Graphics;

/**
 *
 * @author Mido Austin
 */
public class Vehicle {
    int x;
    int y;
    int width;
    int height;
    int speed;
    
    public Vehicle(int newx, int newy){
        x= newx;
        y=newy;
    }
    
    public void paintVeh(Graphics g){
        
    }
    
    public int getx(){
        return x;
    }
    
    public void setx(int newx){
        x = newx;
    }
    
    public int gety(){
        return y;
    }
    
    public void sety(int newy){
        y = newy;
    }
    
    public int getWidth(){
        return width;
    }
    
    public void setWidth(int newWidth){
        width = newWidth;
    }
    
    public int getSpeed(){
        return speed;
    }
}
