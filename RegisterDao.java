package com.yo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	static Connection con;
	public static Connection Datac() {

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user="root";
		String password="Amitkumar@789";
		String url="jdbc:mysql://localhost:3306/userdata";
		con=DriverManager.getConnection(url,user,password);
//		System.out.println("Hello");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
		
	
	
}

	public String insert(User user) {
		Datac();
		String result;
		String sql="insert into utb1 values(?,?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,user.getName() );
			pst.setString(2,user.getEmail());
			pst.setString(3,user.getDob());
			pst.setString(4,user.getMob());
			pst.setString(5, user.getPassword());
			pst.executeUpdate();
			result="Data Entered Successful";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered";
			
		}
		return result;
	}}

