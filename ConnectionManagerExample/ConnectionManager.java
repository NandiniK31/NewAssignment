package ConnectionManagerExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import ContactManagement.Contact;

public class ConnectionManager {
  
	/*
	 * create a ConnectionManager class. static member holds only one instance of
	 * the ConnectionManager class.
	 */      
      private static ConnectionManager jdbc;  
         
	/* ConnectionManager prevents the instantiation from any other class. */  
     private ConnectionManager() {  }  
      
     //Now we are providing gloabal point of access.  
      public static ConnectionManager getInstance() {    
                                   if (jdbc==null)  
                                 {  
                                          jdbc=new  ConnectionManager();  
                                 }  
                       return jdbc;  
           }  
          
      	// to get the connection from methods like insert, view etc.   
        private static Connection getConnection()throws ClassNotFoundException, SQLException  
        {  
              
            Connection con=null;
            String dbURL = "jdbc:mysql://localhost:3306/ebookshop";
    		String username = "root";
    		String password = "root";  
    		con = DriverManager.getConnection(dbURL, username, password);
            return con;  
              
        }  
          
    //to view the data from the database        
    public  void view() throws SQLException  
    {  
      Connection con = null;  
      PreparedStatement ps = null;  
      ResultSet rs = null;  
      try {  
           con=this.getConnection();  
           ps=con.prepareStatement("select * from books"); 
           rs=ps.executeQuery();  
           while (rs.next()) {  
               System.out.print("id: " + rs.getInt("id"));
               System.out.print(", title: " + rs.getString("title"));
               System.out.print(", author: " + rs.getString("author"));
               System.out.print(", price: " + rs.getFloat("price"));
               System.out.println(", qty: " + rs.getInt("qty"));
           }              
        } catch (Exception e) { System.out.println(e);}  
        finally{  
        	closeConnection(con,rs,ps);
              }  
    } 
    
    public void closeConnection(Connection con, ResultSet rs, PreparedStatement ps) throws SQLException {
    	 if(rs!=null){  
             rs.close();  
         }if (ps!=null){  
           ps.close();  
         }if(con!=null){  
           con.close();  
       }   
    }
}
