package javatest;

import java.awt.Color;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
public class SwingUpdate extends JFrame 
{
		JLabel name,age,id;
		JTextField Tname,Tage,Tid;
		JButton btn_update;
		PreparedStatement pt;
		String[] columnNames = {"id", "name", "age"};
		static JTable table;
		JFrame f;
		Connection con;
		String from;
		public SwingUpdate()
		{
		    super("TABLE UPDATE OPERATIONS");
		    id = new JLabel("Id:");
		    name = new JLabel("Name:");
		    age = new JLabel("Age:");
		    id.setBounds(20, 20, 100, 20);
		    name.setBounds(20, 50, 100, 20);
		    age.setBounds(20, 80, 100, 20);
		    
		    Tid = new JTextField(20);
		    Tname = new JTextField(20);
		    Tage = new JTextField(20);
		    Tid.setBounds(130,20,150,20);
		    Tname.setBounds(130, 50, 150, 20);
		    Tage.setBounds(130, 80, 150, 20);
		    btn_update = new JButton("Update");
		    btn_update.setBounds(180, 120, 80, 30);
	
		    
		    setLayout(null);
		    add(id);
		    add(name);
		    add(age);
		    add(Tid);
		    add(Tname);
		    add(Tage);
		    add(btn_update);
		    
		    btn_update.setForeground(Color.green);
		 
	       btn_update.addActionListener(new  ActionListener() {

		        public void actionPerformed(ActionEvent e) {
		        try{
		        
		          theQuery("update student set name = '"+Tname.getText()+"', age = "+Tage.getText()+" where id = "+Tid.getText());
		        }
		        catch(Exception ex){}
		        }
	       });
			      
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setVisible(true);
		    setLocationRelativeTo(null);
		    setSize(500,200);
		   
	}

		public void theQuery(String query){
		     Connection con = null;
		     Statement st = null;
		     try{
		         con = DriverManager.getConnection("jdbc:mysql://localhost/details","root","root");
		         st = con.createStatement();
		         st.executeUpdate(query);
		         JOptionPane.showMessageDialog(null,"Query Executed successfully");
		     }catch(Exception ex){
		         JOptionPane.showMessageDialog(null,ex.getMessage());
		     }
	 }

		
	    public static void main(String[] args){
	    
	        new  SwingUpdate();
	    }
	}


