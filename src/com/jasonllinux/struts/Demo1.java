package com.jasonllinux.struts;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String username;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
