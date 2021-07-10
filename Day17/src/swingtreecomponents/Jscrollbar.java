package swingtreecomponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
public class Jscrollbar extends JFrame
{
	  JScrollPane scrollpane;
	  
	  Jscrollbar()
	  {
		  super("Authors List");
	      setSize(300, 200);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      String names[] = {"1. Agatha Christie", "2. Anthony Horowitz", "3. Enid Blyton",
	                               "4. Jeffrey Archer", "5. Lucy Foley", 
	                               "6. Christopher Huang", "7. Sidney Sheldon",
	                               "8. J.K Rowling", "9. Chetan Bhagat", 
	                               "10. Tilly Bagshawe", "11. Judith Krantz", 
	                               "12. Rick Riordan" };
	  
	        JList l = new JList(names);
	        l.setBackground(Color.DARK_GRAY);
	        l.setForeground(Color.WHITE);
	        l.setFont(new Font("Castellar",Font.BOLD,10));
	        scrollpane = new JScrollPane(l);
	        getContentPane().add(scrollpane, BorderLayout.CENTER);
	    }

	    public static void main(String args[])
	    {
	       Jscrollbar s = new Jscrollbar();
	       s.setVisible(true);
	    }
	}
		  
	  