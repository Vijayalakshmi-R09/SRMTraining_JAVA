package awtcomponents;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginPage extends Frame implements ActionListener
{
    Label n=new Label("User:",Label.CENTER);
    Label p=new Label("password:",Label.CENTER);
    TextField name=new TextField(20);
    TextField pass=new TextField(20);
     Button b1=new Button("LOGIN");
     Button b2=new Button("CLEAR");
      LoginPage()
    {
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
      }  
        public void setLocationAndSize()
        {
        n.setBounds(50, 150, 100, 30);
        p.setBounds(50, 220, 100, 30);
        name.setBounds(150, 150, 150, 30);
        pass.setBounds(150, 220, 150, 30);
        b1.setBounds(160,260,70,40);
        b2.setBounds(250,260,70,40);
}
 public void addComponentsToContainer() {
       add(n);
        add(name);
        add(p);
       add(pass);
        add(b1);
       add(b2);
}

 public void addActionEvent() {
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    @Override
        public void actionPerformed(ActionEvent ae) 
      {
        String str = ae.getActionCommand();
        String utext;
        String ptext;
        utext = name.getText();
        ptext = pass.getText();
        if(str.equals("LOGIN")) 
         {
            if(utext.equalsIgnoreCase("Viji") && ptext.equalsIgnoreCase("1234"))
           {
               JOptionPane.showMessageDialog(this, "Login Successful");
               }
           else{  JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
          }
        if(str.equals("CLEAR")){name.setText("");pass.setText("");}
         }
}

public class Login{
    public static void main(String args[])
    {
        LoginPage lp=new LoginPage();
        lp.setLayout(null);
        lp.setVisible(true);
        lp.setSize(600,600);
        lp.setTitle("Login Page"); 
        lp.setBackground(Color.PINK);
    }
}
