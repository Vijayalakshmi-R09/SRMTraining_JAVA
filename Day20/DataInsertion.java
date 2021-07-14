import java.sql.*;  
class DataInsertion
{  
    public static void main(String args[])
    {  
	    try
	    {  
		    Class.forName("com.mysql.cj.jdbc.Driver");  
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");  
		    
		    Statement st=con.createStatement(); 
		    int result = st.executeUpdate("insert into student(Id,Name,Age) values(4,'Eva',18)");
		    if (result > 0)
		    {
		        System.out.println("Successfully inserted\n");
		    }
		     else
		     {          
		    	 System.out.println("Unsucessful insertion \n"); 
		     }
		                    
		    System.out.println("Table Details:(After Insertion) ");
		    System.out.println("***********************************");
		    ResultSet rs=st.executeQuery("select * from student");  
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