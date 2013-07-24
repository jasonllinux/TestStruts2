package com.jasonllinux.struts.action;

import com.jasonllinux.struts.bean.User;
import com.jasonllinux.struts.dao.UserDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String tip;
	
	public String login() {
		User user = new User();
//		System.out.println("username: "+ username);
//		System.out.println("password: "+ password);
		user.setUsername(username);
		user.setPassword(password);
		UserDAO dao = new UserDAO();
		boolean flag = dao.login(user);
		
		if(flag) {
			//如果登录成功  把信息放到session
			ActionContext.getContext().getSession().put("username", username);
			return SUCCESS;
		}else {
			this.setTip("login failed");
			return INPUT;
		}
		
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
	
	

}
