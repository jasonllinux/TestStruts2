package com.jasonllinux.struts.action;

import com.jasonllinux.struts.bean.Admin;
import com.jasonllinux.struts.dao.AdminDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private String password;
	private String tip;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}


	public String adminLogin() {
		Admin admin = new Admin();
		
		admin.setUsername(username);
		admin.setPassword(password);
		
		AdminDAO dao = new AdminDAO();
		boolean flag = dao.login(admin);
		
		if(flag) {
			ActionContext.getContext().getSession().put("qx", admin.getQx());
			ActionContext.getContext().getSession().put("username", admin.getUsername());
			
			return SUCCESS;
		}else {
			this.tip = "login failed";
			return INPUT;
		}
	}

}
