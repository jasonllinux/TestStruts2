package com.jasonllinux.struts.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.jasonllinux.struts.bean.User;

//用户数据库操作类
public class UserDAO {
	
	private Connection con;
	private PreparedStatement pt;
	private ResultSet rs;
	
	public boolean findUser(String username) {
		boolean flag = false;
		con = DataBaseDAO.getConnection();
		
		try{
			pt = con.prepareStatement("select * from users where username=?");
			pt.setString(1, username);  //设置参数
			
			rs = pt.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeConnection(con);
		}
		return flag;
		
	}
	
	
	public int save(User user) {
		int i = 0;
		con = DataBaseDAO.getConnection();
		try {
			pt = con.prepareStatement("insert into users(username, password,name,nic,sex,age,email,phone,selfshow) values(?,?, ?, ?, ?, ?, ?, ?, ?)");
			
			pt.setString(1, user.getUsername());
			pt.setString(2, user.getPassword());
			pt.setString(3, user.getName());
			pt.setString(4, user.getNic());
			pt.setString(5, user.getSex());
			pt.setInt(6, user.getAge());
			pt.setString(7, user.getEmail());
			pt.setString(8, user.getPhone());
			pt.setString(9, user.getSelfshow());
			
			i = pt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
//			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeConnection(con);
		}
		
		return i;
	}
	
	public boolean login(User user) {
		boolean flag = false;
		con = DataBaseDAO.getConnection();
		try {
			pt = con.prepareStatement("select * from users where username=? and password=?");
			
			pt.setString(1, user.getUsername());
			pt.setString(2, user.getPassword());
			rs = pt.executeQuery();
			if(rs.next()) {
				flag = true;
			}

		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeConnection(con);
		}
		return flag;
	}
	
	
	public List<User> findAllUsers() {
		List<User> list = new ArrayList<>();
		con = DataBaseDAO.getConnection();
		try {
			pt = con.prepareStatement("select * from users");
			rs = pt.executeQuery();
			while(rs.next()) {
				User user = new User();
				//TODO
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setName(rs.getString(4));
				user.setNic(rs.getString(5));
				user.setSex(rs.getString(6));
				user.setAge(rs.getInt(7));
				user.setEmail(rs.getString(8));
				user.setPhone(rs.getString(9));
				user.setSelfshow(rs.getString(10));
				list.add(user);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();

		} finally {
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeConnection(con);
		}
		return list;
		
	}
	
	// 查询用户信息
	public User selectInfo(String username) {
		User user = new User();
		con = DataBaseDAO.getConnection();
		try {
			pt = con.prepareStatement("select * from users where username=?");
			pt.setString(1, username);
			rs = pt.executeQuery();
			
			if(rs.next()) {
//				user.seti
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setName(rs.getString(4));
				user.setNic(rs.getString(5));
				user.setSex(rs.getString(6));
				user.setAge(rs.getInt(7));
				user.setEmail(rs.getString(8));
				user.setPhone(rs.getString(9));
				user.setSelfshow(rs.getString(10));
			}
 			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseDAO.closeRs(rs);
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeConnection(con);
		}
		return user;
	}
	
	
	public int update(User user) {
		
		int i = 0;
		con = DataBaseDAO.getConnection();
		try {
			pt = con.prepareStatement("update users set password=?, name=?, nic=?, sex=?, age=?, email=?, phone=?, selfshow=? where username=? and id=?");
			
			pt.setString(1, user.getPassword());
			pt.setString(2, user.getName());
			pt.setString(3, user.getNic());
			pt.setString(4, user.getSex());
			pt.setInt(5, user.getAge());
			pt.setString(6, user.getEmail());
			pt.setString(7, user.getPhone());
			pt.setString(8, user.getSelfshow());
			pt.setString(9, user.getUsername());
			pt.setInt(10, user.getId());
			
			i = pt.executeUpdate();
			
		} catch (SQLException e) {
			
		}finally {
			DataBaseDAO.closePt(pt);
			DataBaseDAO.closeConnection(con);
		}
		return i;
	}

}
