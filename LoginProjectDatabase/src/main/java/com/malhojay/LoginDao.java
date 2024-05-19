package com.malhojay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
	
	String url = "jdbc:postgresql://localhost:5432/postgres";
	String username = "postgres";
	String password = "Qwerty@12345";
	public boolean checkLogin(String user, String pass) throws ClassNotFoundException {
		String sql = "select * from public.\"Friends\" where name = ? and age = ?";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, user);
			st.setInt(2, Integer.parseInt(pass));
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
