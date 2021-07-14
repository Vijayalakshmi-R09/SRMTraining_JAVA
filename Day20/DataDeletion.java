import java.sql.*;  
    class DataDeletion{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");  
    
    Statement st=con.createStatement(); 
    st.executeUpdate("delete from student where Id=1");     
    System.out.println("deleted"); 
    con.close();  
    }catch(Exception e){ System.out.println(e);
System.out.println("database not connected");}  
    }  
    }