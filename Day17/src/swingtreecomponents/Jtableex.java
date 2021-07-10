package swingtreecomponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Jtableex extends JFrame 
{
	JFrame f;  
	Jtableex()
	{    
	    f=new JFrame();  
	    String data[][]={ {"01","Venus","25"},    
	                      {"02","Zeus","29"},    
	                      {"03","Sonny","23"},
	                      {"04","Vinyl","30"}};    
	    String column[]={"ID","NAME","AGE"};         
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(50,200,200,300); 
	    jt.setBackground(Color.DARK_GRAY);
	    jt.setForeground(Color.WHITE);
//	    jt.setCellSelectionEnabled(true);  
//        ListSelectionModel sel= jt.getSelectionModel();  
//        sel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
//        
//        sel.addListSelectionListener(new ListSelectionListener() 
//        {  
//	    	@Override
//	    	public void valueChanged(ListSelectionEvent e)
//	    	{
//	    		String Data = null;  
//	            int[] row = jt.getSelectedRows();  
//	            int[] columns = jt.getSelectedColumns();  
//	            for (int i = 0; i < row.length; i++) 
//	            {  
//	              for (int j = 0; j < columns.length; j++) 
//	              {  
//	                Data = (String) jt.getValueAt(row[i], columns[j]);  
//	              } 
//	            }  
//	            System.out.println("Table element selected is: " + Data);  
//	          }      
//	    	
//	        });  
        JScrollPane sp=new JScrollPane(jt); 
	    f.add(sp);   
	    f.setSize(300,150);    
	    f.setVisible(true); 
    }

	public static void main(String[] args) 
	{
		Jtableex tb=  new Jtableex();  
	}

}
   