/*
 * 
 */
package TrafficLights;

import Compute.SelectCounts;
import Compute.TrafficLightSet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Mido Austin
 */
public class Intersections implements ActionListener,Runnable{
    
    int junction=3;
    int duration=20;
    Timer timer;
    int time;
    
    static int j2,j3,j4,jj1,jj2,jj3,jj4;
    static int j1=j2=j3=j4=jj1=jj2=jj3=jj4=12;
 
    static JFrame frame = new JFrame("Intersections");
    Road road = new Road(0);
    JButton back = new JButton("BACK");
    Container south = new Container();
    Graphics g;
    boolean run;
    
    JLabel throughput = new JLabel("Initializing. . . ");
    
    /*public static void main (String[] args){
        
        Intersections inter = new Intersections(3);
        Road roadStatic = new Road(0);
        
        roadStatic.setNumber(j1, j2, j3, j4, jj1, jj2, jj3, jj4);
        roadStatic.lightPosition = inter.junction;
        inter.time = inter.duration;
        inter.setRun(true);
        inter.run();
        
    }*/
    
    //for changing lights at intersections

    public Intersections(int newLightPosition) {
        
        frame.setSize(1200,590);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        road.setLightPosition(newLightPosition);
        
        frame.setVisible(true);
                
        south.setLayout(new GridLayout(1,1));
        //south.add(start);
        back.addActionListener(this);
        south.add(throughput);
        south.setLayout(new GridLayout(1,1));
        south.add(back);
        back.addActionListener(this);
        frame.add(south,  BorderLayout.SOUTH);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //new Management().setVisible(true);
        //run = false;
        
        frame.dispose();
        //((Timer)evt.getSource()).stop();
    }
    ActionListener action;
    //Thread t = new Thread();
    int[] trafficLightsTime;
    int[] intersectionNumbers;
    

    @Override
    public void run() {
            //set no. of vehicles
            SelectCounts select = new SelectCounts(53, 1);
            SelectCounts select2 = new SelectCounts(53, 2);
            intersectionNumbers = new int[]{select.VehIn1(), select.VehIn2(), select.VehIn3(), select.VehIn4()*2-20,select.VehIn1()*2-20, select.VehIn2()*2-40, select.VehIn3()*2-10, select.VehIn4()*2-40};
            road.setNumber(intersectionNumbers[0], intersectionNumbers[1], intersectionNumbers[2], intersectionNumbers[3], intersectionNumbers[4], intersectionNumbers[5], intersectionNumbers[6], intersectionNumbers[7]);

            //set no. of time
            TrafficLightSet tls = new TrafficLightSet(1);
            //TrafficLightSet tls2 = new TrafficLightSet(2);
            trafficLightsTime = new int[]{tls.timeFor1,tls.timeFor2,tls.timeFor3,tls.timeFor4};
            int speed = 1000;//1 seconds

            action = new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent ae) {
                    /*if(run == true){*/
                        if(time>0 && junction != 0){
                            System.out.println("i am here " +time);
                            road.lightPosition = junction;
                            throughput.setText("Timer : "+time);
                             if (junction == 1){
                                road.setNumber(intersectionNumbers[0]-(-time*2), intersectionNumbers[1], intersectionNumbers[2], intersectionNumbers[3], intersectionNumbers[4], intersectionNumbers[5]-(-time*2), intersectionNumbers[6], intersectionNumbers[7]);
                             }else if (junction == 2){
                                road.setNumber(intersectionNumbers[0], intersectionNumbers[1]-(-time*2), intersectionNumbers[2], intersectionNumbers[3], intersectionNumbers[4], intersectionNumbers[5], intersectionNumbers[6]-(-time*2), intersectionNumbers[7]);
                             }else if (junction == 3){
                                road.setNumber(intersectionNumbers[0], intersectionNumbers[1], intersectionNumbers[2]-(-time*2), intersectionNumbers[3], intersectionNumbers[4], intersectionNumbers[5], intersectionNumbers[6], intersectionNumbers[7]-(-time*2));
                             }else if (junction == 4){
                                road.setNumber(intersectionNumbers[0], intersectionNumbers[1], intersectionNumbers[2], intersectionNumbers[3]-(-time*2), intersectionNumbers[4]-(-time*2), intersectionNumbers[5], intersectionNumbers[6], intersectionNumbers[7]);
                             }
                            road.repaint();
                            time--;
                        }else if(time == 0 && junction != 0){
                            road.lightPosition = 0;
                            road.repaint();
                            time = trafficLightsTime[junction-1];
                            System.out.print(time);
                            System.out.println(junction);
                            junction--;
                        }else if (junction == 0){
                            junction = 4;
                            time = trafficLightsTime[junction-1];
                            System.out.print(time);
                        }
                    /*}else{
                        //timer.removeActionListener(this);
                        timer.start();
                        road.repaint();
                    }*/

                }

            };
            frame.add(road);

            timer = new Timer(speed, action);
            /*if(new Management().isVisible()){
                timer.removeActionListener(this);
                road.repaint();
            }else{*/
                timer.restart();
                road.repaint();
            //}
        
    }
   

    public boolean setRun(boolean run){
    this.run = run;
    return run;
    }
}