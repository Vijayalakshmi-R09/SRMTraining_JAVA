import java.sql.*;  
    class DataInsertion{  
    public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");  
    
    Statement stmt=con.createStatement(); 
     int result = stmt.executeUpdate("insert into student(Id,Name,Age) values(1,'Zen',18)");
            if (result > 0)
                System.out.println("successfully inserted");
  
            else
                System.out.println(
                    "unsucessful insertion ");  
    con.close();  
    }catch(Exception e){ System.out.println(e);
System.out.println("database not connected");}  
    }  
    }