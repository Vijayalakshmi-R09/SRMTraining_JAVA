package awt2;

import java.awt.event.AdjustmentEvent;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.AdjustmentListener;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JFrame;
public class ScrollBarEx extends JFrame implements AdjustmentListener
{
	JLabel l=new JLabel("COLOR MIXER SCROLLS!!!!",JLabel.CENTER);
	private JLabel labelRed, labelGreen, labelBlue;
	private JScrollBar sBarRed, sBarGreen, sBarBlue;
	
	ScrollBarEx()
	{
		setLayout(new FlowLayout());
	    labelRed = new JLabel("Adjust :");
	    labelGreen = new JLabel("Adjust :");
	    labelBlue = new JLabel("Adjust :");
	    sBarRed = new JScrollBar(JScrollBar.HORIZONTAL,0,20,0,255);
	    sBarGreen = new JScrollBar(JScrollBar.HORIZONTAL,0,20,0,255);
	    sBarBlue = new JScrollBar(JScrollBar.HORIZONTAL,0,30,0,255);
	    sBarRed.addAdjustmentListener(this);
	    sBarGreen.addAdjustmentListener(this);
	    sBarBlue.addAdjustmentListener(this);
	    add(labelRed);
	    add(sBarRed);
	    add(labelGreen);
	    add(sBarGreen);
	    add(labelBlue);
    add(sBarBlue);
	}
    @Override
    public void adjustmentValueChanged(AdjustmentEvent event){
        int cRed, cGreen, cBlue;
        cRed = sBarRed.getValue();
        cBlue = sBarBlue.getValue();
        cGreen = sBarGreen.getValue();

        getContentPane().setBackground(new Color(cRed,cBlue,cGreen));
    }

	public static void main(String[] args)
	{
		ScrollBarEx sb=new ScrollBarEx();  
        sb.setSize(600,300);
        sb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sb.setVisible(true);
	}
}
