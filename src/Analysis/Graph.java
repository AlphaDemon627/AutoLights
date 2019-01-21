/*
 * to graphically represent data
 */
package Analysis;

import AutoLightsUI.Analysis;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Mido Austin
 */
public class Graph extends JFrame implements ActionListener {
    JFrame frame = new JFrame("Graph");
    JButton back = new JButton("BACK");
    Container south = new Container();
    
    
    paintGraph pg = new paintGraph();
    
    
    
    public Graph() {
       // pg.junction = junc;
        
        frame.setSize(800,480);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(pg);
        
        frame.setVisible(true);
                
        south.setLayout(new GridLayout(1,1));
        south.add(back);
        back.addActionListener(this);
        frame.add(south,  BorderLayout.SOUTH);
    }
    
    public static void main (String args[]){
        drawGraph(3);
    }
    public static void drawGraph(int junction){
        
        GetDBData dbdata = new GetDBData(junction);
        Graph graph = new Graph();
        //graph
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        new Analysis().setVisible(true);
        frame.dispose();
        pg.removeAll();
    }

}
