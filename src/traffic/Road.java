
package traffic;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Road extends JPanel {

    final int LANE_HEIGHT = 150;
    final public int ROAD_WIDTH = 600;
    ArrayList<Vehicle> cars = new ArrayList<>();
    int carCount = 0;
    
    public Road(){
        super();
    }
    
    public void addCar(Vehicle v){
        cars.add(v);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(0, 0, 300, 500);
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);
        for(int a=LANE_HEIGHT; a<LANE_HEIGHT*4; a=a+LANE_HEIGHT){//create lanes
            for(int b=0; b<getWidth(); b=b+40){//CREATE LINE
                g.fillRect(b, a, 30, 5);
            }
        }
        //draw cars
        for (int a=0; a< cars.size();a++){
            cars.get(a).paintVeh(g);
        }
    }
    public void step() {
        for(int a=0; a<cars.size(); a++){
            Vehicle v = cars.get(a);
            if (collision(v.getx()+v.getSpeed(), v.gety(), v)== false){//there's no collision
                v.setx(v.getx() + v.getSpeed());
                /*if(v.getx() > ROAD_WIDTH){
                    if (collision(0, v.gety(), v)== false){
                          v.setx(0);
                          
                    }
                }*/
                carCount ++;
            }
            else{//there's a car ahead
                if (v.gety()>40 && (collision(v.getx(), v.gety() - LANE_HEIGHT, v)== false)){
                        v.sety(v.gety() + LANE_HEIGHT);
                    
                }else if(v.gety()<40+3*LANE_HEIGHT && (collision(v.getx(), v.gety() + LANE_HEIGHT, v)== false)){
                    v.sety(v.gety() + LANE_HEIGHT);
                }
            }
        }
    }
    
    public boolean collision(int x, int y, Vehicle v){
        for(int a = 0; a < cars.size(); a++){
            Vehicle u = cars.get(a);
            if (y== u.gety()){//if it is on the same lane
                if(u.equals(v)==false){//if its not checking itself
                    if(x<u.getx() + u.getWidth() && v.getWidth()+x > u.getx()){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public int getCarCount(){
        return carCount;
    }
    
    public void resetCarCount(){
        carCount = 0;
    }
}
