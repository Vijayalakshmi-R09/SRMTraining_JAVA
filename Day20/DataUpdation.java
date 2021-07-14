import java.sql.*;  
    class DataUpdation{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");  
    
    Statement st=con.createStatement(); 
    String sql="UPDATE student " +"SET Age = 20 WHERE Id in (3)";
     int result = st.executeUpdate(sql);
      st.executeUpdate(sql);
            if (result > 0)
                System.out.println("successfully Updated");
  
            else
                System.out.println(
                    "unsucessful Updation ");  
    con.close();  
    }catch(Exception e){ System.out.println(e);
System.out.println("database not connected");}  
    }  
    }