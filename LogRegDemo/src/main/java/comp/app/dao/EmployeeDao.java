package comp.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import comp.app.model.Employee;

public class EmployeeDao {
      
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con =null;
		Class.forName("com.mysql.cj.jdbc.Driver");
    	System.out.println("Driver Found");
    	con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java","root","pranav1607");
    	System.out.println("Connection Established");
		return con;
	}
	
	public static int save(Employee e) throws ClassNotFoundException, SQLException
	{
		int i = 0;
		try
		{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("insert into employee(name,password,email,phoneNo)values(?,?,?,?)");
		stmt.setString(1, e.getName());
		stmt.setString(2, e.getPassword());
		stmt.setString(3, e.getEmail());
		stmt.setString(4, e.getPhoneNo());
		i=stmt.executeUpdate();
		}catch(Exception e1)
		{
			return i;
		}
		return i;
	}
	
	public static boolean validateEmp(Employee e) throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement(" select * from employee where name=? and password=?");
		pstmt.setString(1, e.getName());
		pstmt.setString(2, e.getPassword());
		ResultSet rs = pstmt.executeQuery();
		boolean b = rs.next();
		return b;
	}
}
