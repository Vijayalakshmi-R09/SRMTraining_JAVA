package swingcomponent;

import javax.swing.JFrame;
import javax.swing.*;  
import java.awt.*;  
import java.text.*;  
import java.util.*; 
public class DigiClock implements Runnable
{  
	JFrame f;  
	Thread t=null;  
	int hours=0, minutes=0, seconds=0;  
	String timeString = "";  
	JLabel l,l1;  
	int am=1;  
	DigiClock(){  
	    f=new JFrame();  
	      
	    t = new Thread(this);  
	        t.start();  
	      
	    l=new JLabel();  
	    l1=new JLabel("DIGITAL WATCH");
	    l1.setFont(new Font("Castellar",Font.BOLD,35));
	    l1.setBounds(10,10,400,70);
	    l.setBounds(100,100,190,50);  
	    l.setForeground(Color.BLUE);
	    l.setFont(new Font("Castellar",Font.BOLD,25));
	    f.add(l);  
	    f.add(l1);
	    f.setSize(400,500);  
	    f.setLayout(null);  
	    f.setTitle("DIGITAL WATCH");
	    f.setVisible(true);  
	}  
	  
	 public void run() {  
	      try {  
	         while (true) 
	         {  
	            Calendar cal = Calendar.getInstance();  
	            hours = cal.get( Calendar.HOUR_OF_DAY );  
	            if ( hours > 12 ) 
	            	hours -= 12; 
	            	am=0;
	            minutes = cal.get( Calendar.MINUTE );  
	            seconds = cal.get( Calendar.SECOND );  
	  
	            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
	            Date date = cal.getTime();  
	            timeString = formatter.format( date );
	            if(am==1)
	            { 
	            	timeString=timeString+" am";
	            }
	            else
	            {
	            	timeString=timeString+" pm";
	            }
	            printTime();  
	  
	            t.sleep( 1000 );  
	         }  
	      }  
	      catch (Exception e) { }  
	 }  
	  
	public void printTime()
	{  
		l.setText(timeString);  
	}  
	  
	public static void main(String[] args) {  
	    new DigiClock();  
	            
	}  
}  
