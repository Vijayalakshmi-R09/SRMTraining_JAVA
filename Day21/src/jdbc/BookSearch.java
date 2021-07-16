package jdbc;

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.*;  
import java.awt.*;  
import java.sql.*;  
public class BookSearch extends JFrame implements ActionListener {  
 
    JLabel l,lb, lb1, lb2, lb3, lb4, lb5;  
    JTextField tf1, tf2, tf3, tf4, tf5;  
    JButton btn;  
   
    BookSearch() {  
        
        super("DreamWorld Books");  
        l=new JLabel("DreamWorld Books Welcomes you!");
        l.setBounds(5,1,200,20);
        l.setForeground(Color.black);
        lb5 = new JLabel("Enter Book Id:");  
        lb5.setBounds(10, 40, 100, 20);  
        tf5 = new JTextField(20);  
        tf5.setBounds(130, 40, 200, 20);  
        btn = new JButton("Submit");  
        btn.setBounds(50, 70, 100, 20);  
        btn.addActionListener(this);  
        lb = new JLabel("SEARCH DATABASE");  
        lb.setBounds(20, 95, 450, 30);  
        lb.setForeground(Color.DARK_GRAY);  
        lb.setFont(new Font("Castellar", Font.BOLD, 20));  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(500, 500);  
        lb1 = new JLabel("Book Id:");  
        lb1.setBounds(20, 130, 100, 20);  
        tf1 = new JTextField(50);  
        tf1.setBounds(130, 130, 200, 20);  
        lb2 = new JLabel("Book Name:");  
        lb2.setBounds(20, 160, 100, 20);  
        tf2 = new JTextField(100);  
        tf2.setBounds(130, 160, 200, 20);  
        lb3 = new JLabel("Author:");  
        lb3.setBounds(20, 190, 100, 20);  
        tf3 = new JTextField(50);  
        tf3.setBounds(130, 190, 200, 20);  
        lb4 = new JLabel("Publication Date:");  
        lb4.setBounds(20, 220, 100, 20);  
        tf4 = new JTextField(50);  
        tf4.setBounds(130, 220, 100, 20);  
        setLayout(null);  
        add(l);
        add(lb5);  
        add(tf5);  
        add(btn);  
        add(lb);  
        add(lb1);  
        add(tf1);  
        add(lb2);  
        add(tf2);  
        add(lb3);  
        add(tf3);  
        add(lb4);  
        add(tf4);  
        
        tf1.setEditable(false);  
        tf2.setEditable(false);  
        tf3.setEditable(false);  
        tf4.setEditable(false);  
    }  
    public void actionPerformed(ActionEvent e) {  
        
        try {  
            String str = tf5.getText();  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "root");  
            PreparedStatement st = con.prepareStatement("select * from store where id=?");  
            st.setString(1, str);  
           
            ResultSet rs = st.executeQuery();  
            if (rs.next()) {  
                String s = rs.getString(1);  
                String s1 = rs.getString(2);  
                String s2 = rs.getString(3);  
                String s3 = rs.getString(4);  
              
                tf1.setText(s);  
                tf2.setText(s1);  
                tf3.setText(s2);  
                tf4.setText(s3);  
            } else {  
                JOptionPane.showMessageDialog(null, "Name not Found");  
            }  
              
        } catch (Exception ex) {  
            System.out.println(ex);  
        }  
    }      

	public static void main(String[] args)
	{
		new BookSearch();
	}
}
