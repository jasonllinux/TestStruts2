package com.jasonllinux.app;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private String username;
	private String password;
	
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
	
	@Override
	public String execute() throws Exception {
		if (getUsername().equals("shenjie") && getPassword().equals("123")) {
			System.out.println("login sucess......");
			return SUCCESS;
		}
		return ERROR;
	}
	


}
