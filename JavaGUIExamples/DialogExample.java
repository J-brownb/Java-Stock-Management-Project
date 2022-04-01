import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class DialogExample {  
    private static JDialog d;  
    DialogExample() {  
        JFrame f= new JFrame();  
        d = new JDialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        JButton b = new JButton ("Enter");  
        JButton b2 = new JButton ("Leave");  

        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                DialogExample.d.setVisible(false);  
            }  
        });  
        d.add( new JLabel ("Welcome"));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
        

        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Welcome to my program");
        frame.getContentPane().add(label);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String args[])  
    {  
        new DialogExample();  
    }  
}  