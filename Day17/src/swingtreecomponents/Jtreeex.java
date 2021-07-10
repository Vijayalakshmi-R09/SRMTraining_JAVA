package swingtreecomponents;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Jtreeex {
	JFrame f;
	Jtreeex()
	{
		f=new JFrame();   
	    DefaultMutableTreeNode View=new DefaultMutableTreeNode("View");  
	    DefaultMutableTreeNode Details=new DefaultMutableTreeNode("Details");  
	    DefaultMutableTreeNode Names=new DefaultMutableTreeNode("Names"); 
	    View.add(Details);  
	    Details.add(Names);  
	    DefaultMutableTreeNode r=new DefaultMutableTreeNode("Rhea");  
	    DefaultMutableTreeNode z=new DefaultMutableTreeNode("Zack");  
	    DefaultMutableTreeNode b=new DefaultMutableTreeNode("Barb");  
	    DefaultMutableTreeNode g=new DefaultMutableTreeNode("Keen");  
	    Names.add(r); 
	    Names.add(z);
	    Names.add(b);
	    Names.add(g);     
	    DefaultMutableTreeNode Desig=new DefaultMutableTreeNode("Designation");    
	    DefaultMutableTreeNode t=new DefaultMutableTreeNode("Trainee");  
	    DefaultMutableTreeNode p=new DefaultMutableTreeNode("Programmer");  
	    DefaultMutableTreeNode s=new DefaultMutableTreeNode("Sr.Programmer");  
	    DefaultMutableTreeNode a=new DefaultMutableTreeNode("Analyst");  
	    Desig.add(t); 
	    Desig.add(p); 
	    Desig.add(s);
	    Desig.add(a);  
	    View.add(Desig);
	    JTree jt=new JTree(View);  
	    f.add(jt);  
	    f.setSize(350,350);  
	    f.setVisible(true);  
	}
	
	public static void main(String[] args) 
	{
		new Jtreeex();	
	}
}
