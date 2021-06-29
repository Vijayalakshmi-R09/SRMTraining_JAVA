//<applet code= "AppletDateTime" width = "500" height = "400"></applet>

import java.applet.Applet;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.Font;
import java.awt.Color;
import java.util.GregorianCalendar;

public class AppletDateTime extends Applet implements Runnable
{
	Thread t1,t2;
	public void start()
	{
		t1=new Thread(this);
		t1.start();
	}
	public void init() 
                {
                    setBackground(Color.blue);
                    setForeground(Color.white);
                    
                  }
	public void run() {
		t2=Thread.currentThread();
		while(t2==t1)
		{
			repaint();
			try {
				t2.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
	public void paint(Graphics g)
	{
                Font f = new Font ("TimesRoman", Font.BOLD, 30);
		Calendar c=new GregorianCalendar();
		Date d=c.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                g.setFont(f);
                g.drawString("DATE AND TIMESTAMP: ",10,30);
		g.drawString(sdf.format(d), 80, 80);
	}
}


