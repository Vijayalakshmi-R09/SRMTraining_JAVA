package swingtreecomponents;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;  

public class JComboAndTabbedPane 
{
	JFrame f;  
	JComboAndTabbedPane()
	{
		f=new JFrame("ComboBox And Tabbed Pane");   
	    final JLabel label = new JLabel();          
	    label.setHorizontalAlignment(JLabel.CENTER);  
	    label.setSize(400,100);  
	    label.setBounds(20,150,400,30);
	    label.setForeground(Color.BLUE);
	    label.setFont(new Font("Castellar",Font.BOLD,20));
	    JButton b=new JButton("Show");  
	    b.setBounds(200,100,75,20);  
	    String currency[]={"Dollar","Pound sterling","Zen","Yen","Indian rupee","Euros"};   
	    JTextArea ta=new JTextArea("Vijayalakshmi");  
	    JTextArea ta1=new JTextArea("1001");
	    JTextArea ta2=new JTextArea("NAME: VIJAYALAKSHMI \nID: 1001");
	    JPanel p1=new JPanel();  
	    p1.add(ta);  
	    p1.setBackground(Color.GREEN);
	    p1.setForeground(Color.WHITE);
	    JPanel p2=new JPanel();  
	    p2.add(ta1);
	    p2.setBackground(Color.MAGENTA);
	    p2.setForeground(Color.WHITE);
	    JPanel p3=new JPanel();  
	    p3.add(ta2);
	    p3.setBackground(Color.BLUE);
	    p3.setForeground(Color.WHITE);
	    JTabbedPane tp=new JTabbedPane();  
	    tp.setBounds(50,250,200,200);  
	    tp.add("Name",p1);  
	    tp.add("ID",p2);  
	    tp.add("View",p3);    
	    f.add(tp);  
	    final JComboBox cb=new JComboBox( currency);    
	    cb.setBounds(50,100,100,20);    
	    f.add(cb); 
	    f.add(label); 
	    f.add(b);    
	    f.setLayout(null);    
	    f.setSize(600,600);    
	    f.setBackground(Color.DARK_GRAY);
	    f.setForeground(Color.WHITE);
	    f.setFont(new Font("Castellar",Font.BOLD,15));
	    f.setVisible(true);       
	    b.addActionListener(new ActionListener() 
	    {  
	    	@Override
	        public void actionPerformed(ActionEvent e) 
	    	{       
				String data = "Selected Currency: " + cb.getItemAt(cb.getSelectedIndex());  
				label.setText(data);  
	    	}  
	});  
	    
	}
	
	public static void main(String[] args) 
	{
		new JComboAndTabbedPane(); 
	}
}
  