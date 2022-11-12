package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
	 public static Connection co=null;
		   public static Connection getconnection() throws Exception{
			   if(co==null) {
				   Class.forName("com.mysql.jdbc.Driver");
				   co=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","@zeeshan@K65");
			   }
			   return co;		   
		   }
		}



