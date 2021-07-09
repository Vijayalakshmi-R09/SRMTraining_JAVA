package swingcomponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginPage extends JFrame implements ActionListener {
 
    Container container=getContentPane();
    JLabel ul=new JLabel("USERNAME");
    JLabel pl=new JLabel("PASSWORD");
    JTextField utf=new JTextField();
    JPasswordField pf=new JPasswordField();
    JButton login=new JButton("LOGIN");
    JButton reset=new JButton("RESET");
    JCheckBox shpwd=new JCheckBox("Show Password");
 
    LoginPage()
    {
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    
   public void setLocationAndSize()
   {
       
       ul.setBounds(50,150,100,30);
       pl.setBounds(50,220,100,30);
       utf.setBounds(150,150,150,30);
       pf.setBounds(150,220,150,30);
       shpwd.setBounds(150,250,150,30);
       login.setBounds(50,300,100,30);
       reset.setBounds(200,300,100,30);
       utf.setFont(new Font("Algerian",Font.BOLD,20));
       utf.setForeground(Color.BLUE);
       pf.setFont(new Font("Algerian",Font.BOLD,20));
       pf.setForeground(Color.BLUE);
   }
   
   public void addComponentsToContainer()
   {
       container.add(ul);
       container.add(pl);
       container.add(utf);
       container.add(pf);
       container.add(shpwd);
       container.add(login);
       container.add(reset);
   }
   
   public void addActionEvent() 
   {
       login.addActionListener(this);
       reset.addActionListener(this);
       shpwd.addActionListener(this);
   }


   @Override
   public void actionPerformed(ActionEvent e)
   {
         if (e.getSource() == login) {
           String userText;
           String pwdText;
           userText = utf.getText();
           pwdText = pf.getText();
           if (userText.equalsIgnoreCase("Viji") && pwdText.equalsIgnoreCase("090909")) 
           {
               JOptionPane.showMessageDialog(this, "Login Successful");
           } else 
           {
               JOptionPane.showMessageDialog(this, "Invalid Username or Password");
           }
       }

       if (e.getSource() == reset) 
       {
           utf.setText("");
           pf.setText("");
       }
    
       if (e.getSource() == shpwd) {
           if (shpwd.isSelected()) {
               pf.setEchoChar((char) 0);
           } else {
               pf.setEchoChar('*');
           }
       }
   }

    public static void main(String[] a)
    {
        LoginPage f=new LoginPage();
        f.setTitle("Login Page");
        f.setLayout(null);
        f.setVisible(true);
        f.setBounds(10,10,390,450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
}
