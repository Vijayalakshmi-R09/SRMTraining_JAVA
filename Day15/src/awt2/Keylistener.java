package awt2;

import java.awt.*;  
import java.awt.event.*;  
public class Keylistener extends Frame implements KeyListener{  
    Label l;  
    TextArea ta;  
    Keylistener ()
    {  
        l=new Label();  
        l.setBounds(20,50,100,20);  
        ta=new TextArea();  
        ta.setBounds(20,80,300, 300);  
        ta.addKeyListener(this);  
          
        add(l);
        add(ta);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {  
        l.setText("Key Pressed");  
        l.setBackground(Color.cyan);
        l.setForeground(Color.MAGENTA);
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Key Released");
        l.setBackground(Color.green);
        l.setForeground(Color.WHITE);
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");  
        l.setBackground(Color.LIGHT_GRAY);
        l.setForeground(Color.BLUE);
    }  
  
    public static void main(String[] args) 
    {  
        Keylistener kl=new Keylistener();  
        kl.setLayout(null);
        kl.setTitle("KeyListener events"); 
        kl.setBackground(Color.darkGray);
        kl.setSize(400,400);
        kl.setVisible(true);
    }  
} 
