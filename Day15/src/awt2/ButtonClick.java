package awt2;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;

public class ButtonClick extends Frame implements ActionListener
{
	Label msg =new Label();
	Button b=new Button("Click Me");
	int count=0;
	ButtonClick()
	{
		add(msg);
		add(b);
		msg.setBounds(50,100,300,30);
        b.setBounds(150,150,70,30);
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==b)
        {
			count+=1;
			msg.setText("Button Clicked  "+String.valueOf(count)+" times");
			msg.setFont(new Font("TimesNewRoman", Font.ROMAN_BASELINE, 28));
	        msg.setForeground(Color.CYAN);
        }
		
	}

	public static void main(String[] args)
	{
		ButtonClick tl=new ButtonClick();
		tl.setLayout(null);
        tl.setVisible(true);
        tl.setSize(400,400);
        tl.setTitle("Button Click"); 
        tl.setBackground(Color.darkGray);		
	}	
}
