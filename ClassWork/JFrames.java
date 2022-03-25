
package uk.ac.uos.i2p.s223358;
import javax.swing.*;        
import java.awt.*;


public class JFrames {
	
	
    public static void main(String[] args) {
    	JFrames gui = new JFrames();
    	gui.go() ;

    }
    
    public void go() {
    	JFrame frame = new JFrame();
    	JButton button = new JButton("Click Me");
    	Font bigFont = new Font("serif", Font.BOLD, 28);
    	button.setFont(bigFont);
    	frame.getContentPane().add(BorderLayout.EAST, button);
    	frame.setSize(200,200);
    	frame.setVisible(true);
    }
}
 
