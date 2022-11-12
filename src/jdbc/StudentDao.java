package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	public List<StudentTo>	getAllStudents()throws Exception{
		 Connection co = dbconnect.getconnection();
	
		PreparedStatement ps=co.prepareCall("select * from Student");
	   ResultSet rs = ps.executeQuery();
	   List<StudentTo> list= new ArrayList<StudentTo>();
	   while(rs.next()) {
		   list.add(new StudentTo(rs.getString(1), rs.getString(2), rs.getString(3)));   
	   }
	   return list;
	}
	
	public void insertStudent(StudentTo obj) throws Exception{
		 Connection co = dbconnect.getconnection();	
		 PreparedStatement ps=co.prepareStatement("insert into Student value(?,?,?)");
	   ps.setString(1,obj.getSid());
	   ps.setString(2,obj.getSname());
	   ps.setString(3,obj.getCity());
	   ps.executeUpdate();
	   
	}

}
