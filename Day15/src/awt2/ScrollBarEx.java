package awt2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarEx extends Frame implements AdjustmentListener
{
	Label l=new Label("COLOR MIXER SCROLLS!!!!",Label.CENTER);
	Label l1=new Label();
	Label l2=new Label();
	Label l3=new Label();
    Scrollbar red=new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar green=new Scrollbar(Scrollbar.HORIZONTAL);
    Scrollbar blue=new Scrollbar(Scrollbar.HORIZONTAL);
	ScrollBarEx()
    {
        super();
        setLayout(new FlowLayout());
        add(l);
        add(red);
        add(green);
        add(blue);
        add(l1);
        add(l2);
        add(l3);
        l.setBounds(70,50,500,30);
        red.setBounds(50,100,200,30);
        green.setBounds(50,200,200,30);
        blue.setBounds(50,300,200,30);
        l1.setBounds(50,400,80,30);
        l2.setBounds(150,400,80,30);
        l3.setBounds(250,400,80,30);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this); 
        l.setBackground(Color.WHITE);
        l.setFont(new Font("Algerian",Font.BOLD,30));
        l.setForeground(Color.MAGENTA);
    }
    @Override
	public void adjustmentValueChanged(AdjustmentEvent e) 
    {
    	int cr=0;
        int cg=0;
        int cb=0;
        if(e.getSource()==red)
        {
             cr=e.getValue();
             red.setBackground(Color.RED);
             l1.setText(cr + ":" + cg + ":" + cb);
         }
        else if(e.getSource()==green)
        {
             cg=e.getValue();
             green.setBackground(Color.GREEN);
             l2.setText(cr + ":" + cg + ":" + cb);
        }
        else if(e.getSource()==blue)
        {
             cb=e.getValue();
             blue.setBackground(Color.BLUE);
             l3.setText(cr + ":" + cg + ":" + cb);
        }
  
       	
       l1.setBackground(Color.WHITE);
       l1.setFont(new Font("TimesNewRoman",Font.BOLD,30));
       l1.setForeground(Color.RED);
       l2.setBackground(Color.WHITE);
       l2.setFont(new Font("TimesNewRoman",Font.BOLD,30));
       l2.setForeground(Color.GREEN);
       l3.setBackground(Color.WHITE);
       l3.setFont(new Font("TimesNewRoman",Font.BOLD,30));
       l3.setForeground(Color.BLUE);
	}

	public static void main(String[] args)
	{
		ScrollBarEx sb=new ScrollBarEx();  
		sb.setLayout(null);
        sb.setTitle("ScrooBar Color MIXER"); 
        sb.setBackground(Color.darkGray);
        sb.setSize(600,600);
        sb.setVisible(true);
	}
}
