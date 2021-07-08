package awt2;
import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;
public class HandWindowEvents extends Frame
{
	HandWindowEvents() 
    { 
      addWindowListener(new WindowAdapter() 
      { 
         public void WindowClosing(WindowEvent e) 
          { 
            System.exit(0); 
          } 
       	}) ; 
     } 
	public static void main(String[] args) {
		HandWindowEvents frame = new HandWindowEvents(); 
        frame.setTitle("Anonymous Inner Classes Java Example"); 
        frame.setSize(400,400); 
        frame.setVisible(true); 
	}
}
