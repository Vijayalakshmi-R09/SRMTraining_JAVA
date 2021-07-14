import java.sql.*;  
 class DataUpdation
 {  
    public static void main(String args[])
    {  
	    try
	    {  
		    Class.forName("com.mysql.cj.jdbc.Driver");  
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");  
		    
		    Statement st=con.createStatement(); 
		    String sql="UPDATE student " +"SET Age = 20 WHERE Id in (4)";
		    int result = st.executeUpdate(sql);
		    st.executeUpdate(sql);
		    if (result > 0)
		    {
		    	System.out.println("Successfully Updated\n");
		    }
		    else
		    {
		    	 System.out.println("Unsucessful Updation \n"); 
		    }           
            System.out.println("Table Details:(After Updation) ");
            System.out.println("***********************************");
            ResultSet rs=st.executeQuery("select * from student");  
            while(rs.next())
            {
            	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
            }     
		    con.close();  
	    }catch(Exception e){ System.out.println(e);
	System.out.println("database not connected");}  
    }  
    }