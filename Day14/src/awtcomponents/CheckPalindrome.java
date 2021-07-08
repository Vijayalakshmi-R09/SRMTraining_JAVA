package awtcomponents;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CheckPalindrome extends Frame implements ActionListener{
	
	Label l1=new Label("Enter String: ");
	TextField t1=new TextField();
	Button b1=new Button("CHECK");
	Label resStr=new Label();
	
	CheckPalindrome()
	{
		l1.setBounds(50, 100, 100, 30);
		t1.setBounds(150, 100, 150, 30);
		b1.setBounds(50, 250, 100, 30);
		resStr.setBounds(50,300,100,30);
		
		
		add(l1);
		add(t1);
		add(b1);
		add(resStr);
		
		b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s=t1.getText();
		String rev="";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			resStr.setText("Is Palindrome");
			resStr.setFont(new Font("Serif", Font.BOLD, 20));
			resStr.setForeground(Color.DARK_GRAY);
		}
		else {
			resStr.setText("Not a Palindrome");
			resStr.setFont(new Font("Serif", Font.BOLD, 20));
			resStr.setForeground(Color.DARK_GRAY);
		}
	}
	

	public static void main(String[] args) 
	{
		CheckPalindrome f = new CheckPalindrome();
        f.setTitle("FIND PALINDORME");
        f.setVisible(true);
        f.setSize(400,400);
        f.setResizable(false);

	}
	

}
