package com.StudentSstem.student;

import java.sql.*;

public class StudentDao {
	public Student getStudent(int sid) {
		Student s= new Student();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost/studentDetails","root","root@123");
			Statement st= c.createStatement();
			ResultSet rs= st.executeQuery("select * from Student where sid="+sid);
			
			if(rs.next()) {
				s.setSid(rs.getInt("sid"));
				s.setName(rs.getNString("name"));
				s.setTech(rs.getNString("tech"));
			}
		}catch(Exception e) {System.out.print(e);}
		return s;
	}
	

}
















