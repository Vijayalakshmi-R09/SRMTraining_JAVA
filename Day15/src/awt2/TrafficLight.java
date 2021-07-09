package awt2;

import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;

public class TrafficLight extends Frame implements ItemListener
{
	Label msg =new Label("TRAFFIC LIGTHS");
	CheckboxGroup chg=new CheckboxGroup();
	Checkbox red=new Checkbox("RED",chg,false);
	Checkbox yellow=new Checkbox("YELLOW",chg,false);
	Checkbox green=new Checkbox("GREEN",chg,false);
	
	TrafficLight()
	{
	 add(red);
         add(yellow);
         add(green);
         add(msg);
         red.setBounds(50,100,70,30);
         yellow.setBounds(150,100,70,30);
         green.setBounds(250,100,70,30);
         msg.setBounds(50,150,130,20);
 		 msg.setFont(new Font("Serif", Font.BOLD, 15));
         red.addItemListener(this);
         yellow.addItemListener(this);
         green.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		repaint();	
	}
	@Override
	public void paint(Graphics g)
    { 
		g.setFont(new Font("TimesNewRoman",Font.BOLD,30));
		g.drawOval(250,160,50,50);
		g.drawOval(250,220,50,50);
		g.drawOval(250,280,50,50);
		String col = chg.getSelectedCheckbox().getLabel();
		if(col.equalsIgnoreCase("RED"))
		{
			g.setColor(Color.RED);
			g.fillOval(250,160,50,50);
			g.drawString("STOP",320,190);
		}
		if(col.equalsIgnoreCase("YELLOW"))
		{
			g.setColor(Color.YELLOW);
			g.fillOval(250,220,50,50);
			g.drawString("READY",320,250);
		}
		if(col.equalsIgnoreCase("GREEN"))
		{
		  g.setColor(Color.GREEN); 
		  g.fillOval(250,280,50,50); 
		  g.drawString("GO",320,310);
		}		
	} 
	public static void main(String[] args) 
	{
		TrafficLight tl=new TrafficLight();
		tl.setLayout(null);
        tl.setVisible(true);
        tl.setSize(600,600);
        tl.setTitle("Traffic Lights"); 
//        tl.setBackground(Color.darkGray);
	}
}
