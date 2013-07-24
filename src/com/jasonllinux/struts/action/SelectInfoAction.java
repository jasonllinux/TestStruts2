package com.jasonllinux.struts.action;

import com.jasonllinux.struts.bean.User;
import com.jasonllinux.struts.dao.UserDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SelectInfoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String type;
	
	public String selectInfo() {
		UserDAO dao = new UserDAO();
		User user = dao.selectInfo(username);
		
		ActionContext.getContext().getSession().put("user", user);
		if("allusers".equals(type)) {
			return INPUT;
		}else if("user".equals(type)) {
			return SUCCESS;
		}else {
			return "find";
		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
