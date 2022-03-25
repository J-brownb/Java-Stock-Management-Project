
package uk.ac.uos.i2p.s223358;
import javax.swing.*;        
import java.awt.*;


public class GUIEnhanced {
	
	
    public static void main(String[] args) {
    	GUIEnhanced gui = new GUIEnhanced();
    	gui.go() ;

    }
    
    public void go() {
    	JFrame frame = new JFrame();
    	JButton east = new JButton ("East");
    	JButton west = new JButton ("West");
    	JButton north = new JButton ("North");
    	JButton south = new JButton ("South");
    	JButton center = new JButton ("Center");

    	frame.getContentPane().add(BorderLayout.EAST, east);
    	frame.getContentPane().add(BorderLayout.WEST, west);
    	frame.getContentPane().add(BorderLayout.NORTH, north);
    	frame.getContentPane().add(BorderLayout.SOUTH, south);
    	frame.getContentPane().add(BorderLayout.CENTER, center);
    	
    	frame.setSize(200,200);
    	frame.setVisible(true);
    }
}
 
