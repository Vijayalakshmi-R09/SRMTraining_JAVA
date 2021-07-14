import java.sql.*;  
class MysqlEx
{  
    public static void main(String args[])
    
    {  
    try
    {  
	    Class.forName("com.mysql.cj.jdbc.Driver");  
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");  
	    
	    Statement stmt=con.createStatement(); 
	    System.out.println("Table Details: ");
	    System.out.println("*************************");
	    ResultSet rs=stmt.executeQuery("select * from student");  
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
	    }
	    con.close();  
    }
    catch(Exception e)
    { 
    	System.out.println(e);
    	System.out.println("database not connected");
    }  
   }  
 }