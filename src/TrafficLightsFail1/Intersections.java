package TrafficLightsFail1;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Mido Austin
 */
public class Intersections  {
    static JFrame frame = new JFrame("Intersections");
    Road road = new Road();

    public Intersections() {
        frame.setSize(1200,590);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(road);

        frame.setVisible(true);
    }
    
    public static void main(String args[]){
        new Intersections();
    }
}
