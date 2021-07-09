package swingcomponent;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TemperatureConversion extends JFrame implements ActionListener
{

	JRadioButton rb1,rb2;    
	JLabel l1,l2;
	JTextField tf1;

	TemperatureConversion()
	{      
		rb1=new JRadioButton("Centigrade to Fahrenheit");      
		rb2=new JRadioButton("Fahrenheit to Centigrade");    
		l1=new JLabel("Enter Value ");
		l2=new JLabel();
		tf1=new JTextField();
		ButtonGroup bg=new ButtonGroup();    
		bg.add(rb1);
		bg.add(rb2);     
		add(rb1);
		add(rb2); 
		add(l1);
		add(l2);
		add(tf1);
		setLocationAndSize();
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
	}    
	public void setLocationAndSize()
	{
		l1.setBounds(100,50,100,30);
		rb1.setBounds(100,100,100,30);  
		rb2.setBounds(100,150,100,30);   
		l2.setBounds(70,250,190,30);
		tf1.setBounds(200,50,100,30);
		rb1.setForeground(Color.BLUE);
		rb2.setForeground(Color.BLUE);
		
		l2.setFont(new Font("Algeran",Font.BOLD,30));
	}
	public void actionPerformed(ActionEvent e)
	{    
		if(rb1.isSelected())
		{    
			int tempFahr = (int) ((Double.parseDouble((tf1.getText())) * 5/9) - 32);
		    l2.setText("F to C: "+tempFahr + " C");	
		    l2.setForeground(Color.MAGENTA);
		}
	    
		if(rb2.isSelected())
		{    
			int tempcel = (int) ((Double.parseDouble(tf1.getText())) * 9/5 + 32);
		    l2.setText("C to F: "+tempcel + " F");
		    l2.setForeground(Color.RED);
		}    
	} 
	
	public static void main(String args[])
	{    
		TemperatureConversion tc=new TemperatureConversion();    
		tc.setSize(400,500); 
		tc.setTitle("TEMPERATURE CONVERSION CALC");
		tc.setLayout(null);    
		tc.setVisible(true);  
	}
}   