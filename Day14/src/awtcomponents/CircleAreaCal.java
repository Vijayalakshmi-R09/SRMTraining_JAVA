package awtcomponents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CircleAreaCal extends Frame implements ActionListener 
{
	Label r=new Label("Radius: ");
	TextField rValue=new TextField();
	Button area = new Button("Calculate");
    TextField res=new TextField();
		
	CircleAreaCal()
	{
		
		r.setBounds(50, 150, 100, 30);
		rValue.setBounds(150, 150, 150, 30);
		area.setBounds(50, 250, 100, 30);
        res.setBounds(100,200,100,30);
		
		add(r);
		add(rValue);
		add(area);
		
        add(res);
		
		area.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int radius=Integer.parseInt(rValue.getText());
		
		double area=3.14*radius*radius;
		res.setText("Area : "+String.valueOf(area));
		res.setFont(new Font("TimesNewRoman", Font.ROMAN_BASELINE, 28));
        res.setForeground(Color.BLUE);
		
}
	public static void main(String args[])
	{
		CircleAreaCal f = new CircleAreaCal();
        f.setTitle("AREA of CIRCLE CALCULATION");
        f.setVisible(true);
        f.setSize(400, 600);
        f.setResizable(false);
	}
}
