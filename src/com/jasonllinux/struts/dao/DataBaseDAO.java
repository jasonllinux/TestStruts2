package com.jasonllinux.struts.dao;

import java.sql.*;

public class DataBaseDAO {
	
	private static Connection conn;
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/useradmin";
	private static final String NAME="root";
	private static final String PASSWORD="hhkb";
	
	static {
		try {
			Class.forName(DRIVER);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(URL,NAME , PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void closeConnection(Connection con) {
		if(null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//关闭PT
	public static void closePt(PreparedStatement pt) {
		if(null != pt) {
			try {
				pt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void closeRs(ResultSet rs) {
		if(null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
