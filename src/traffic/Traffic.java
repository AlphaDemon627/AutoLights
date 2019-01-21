/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traffic;

import AutoLightsUI.Management;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mido Austin
 */
public class Traffic implements ActionListener, Runnable{
    
    public static JFrame frame = new JFrame("Traffic Simulation");
    Road road = new Road();
    JButton start = new JButton("START");
    JButton stop = new JButton("RETURN");
    JLabel throughput = new JLabel("Throughput : ");
    Container south = new Container();
    
    JButton hgv = new JButton("add hgv");
    JButton lgv = new JButton("add lgv");
    Container west = new Container();
    
    boolean running = false;
    int carCount = 0;
    long startTime = 0;
    
    int carNo = 0;
    
    public Traffic(){
       
    }
    
    public static void main (String[] args){
        Traffic traffic = new Traffic();
        traffic.run();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource().equals(start)){
            
            if(running == false){
                running=true;
                road.resetCarCount();
                startTime = System.currentTimeMillis();
                Thread t = new Thread(this);
                t.start();
            }
        
        }
        if(event.getSource().equals(stop)){
            running=false;
            frame.setVisible(running);
            new Management().setVisible(true);
            Thread t = Thread.currentThread();
            t.stop();
            
        }
        
        if(event.getSource().equals(lgv)){
            Lgv lgv = new Lgv(0,20);
            road.addCar(lgv);
            for(int x=0; x<road.ROAD_WIDTH; x = x+20){
                for(int y=50; y<450; y = y+150){
                    lgv.setx(x);
                    lgv.sety(y);
                    if(road.collision(x, y, lgv)== false){
                       frame.repaint();
                       return;
                    }
                }  
            }
        }
        //adding lgvs
        if(event.getSource().equals(hgv)){
            Thread truck = new Thread();
            Hgv hgv = new Hgv(0,20);
            road.addCar(hgv);
            for(int x=0; x<road.ROAD_WIDTH; x = x+20){
                for(int y=50; y<480; y = y+150){
                    hgv.setx(x);
                    hgv.sety(y);
                    if(road.collision(x, y, hgv)== false){
                       road.repaint();
                       return;
                    }else{
                        try{
                        truck.sleep(500);
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                        road.repaint();
                        return;
                    }
                }  
            }
        }
    }

    @Override
    public void run() {
        frame.setSize(1000,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        //south container
        south.setLayout(new GridLayout(3,2));
        south.add(start);
        start.addActionListener(this);
        south.add(stop);
        stop.addActionListener(this);
        south.add(throughput);
        frame.add(south,  BorderLayout.SOUTH);
        
        /*west container
        west.setLayout(new GridLayout(3,2));
        west.add(hgv);
        hgv.addActionListener(this);
        west.add(lgv);
        lgv.addActionListener(this);
        frame.add(west,  BorderLayout.WEST);*/

        start.addActionListener(this);
        frame.repaint();
        frame.setVisible(true);
        
        frame.add(road);
        
        //start thread
        /*if(running == false){
                running=true;
                road.resetCarCount();
                startTime = System.currentTimeMillis();
                Thread t = new Thread(this);
                t.start();
            }
        */
        while(running == true)  {
            if(carNo%10 == 0){
                addCar();
                frame.repaint();
            }else if(carNo%28 == 0){
                addBus();
                frame.repaint();
            }
            road.step();
            carCount = road.getCarCount();
            double throughPutCalc = carCount/(1000*(double)( System.currentTimeMillis()- startTime));
            throughput.setText("Throughput : "+throughPutCalc);
            //road.repaint();
                    
            try{
            Thread.sleep(100);
            carNo++;
            frame.repaint();
            //System.out.println(carNo%16);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        
        
    }
    public void addCar(){
        Lgv lgv = new Lgv(0,20);
            road.addCar(lgv);
            for(int x=0; x<road.ROAD_WIDTH; x = x+20){
                for(int y=50; y<450; y = y+150){
                    lgv.setx(x);
                    lgv.sety(y);
                    if(road.collision(x, y, lgv)== false){
                       //road.repaint();
                       return;
                    }
                }  
            }
    }
    
    public void addBus(){
        Thread truck = new Thread();
            Hgv hgv = new Hgv(0,20);
            road.addCar(hgv);
            for(int x=0; x<road.ROAD_WIDTH; x = x+20){
                for(int y=50; y<480; y = y+150){
                    hgv.setx(x);
                    hgv.sety(y);
                    if(road.collision(x, y, hgv)== false){
                       //road.repaint();
                       return;
                    }else{
                        try{
                        truck.sleep(300);
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                        //road.repaint();
                        return;
                    }
                }  
            }
    }
   
}
