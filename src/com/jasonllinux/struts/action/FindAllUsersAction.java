package com.jasonllinux.struts.action;

import java.util.List;

import com.jasonllinux.struts.bean.User;
import com.jasonllinux.struts.dao.UserDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindAllUsersAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	
	public String findAllUsers() {
		UserDAO dao = new UserDAO();
		List<User> list = dao.findAllUsers();
		
		ActionContext .getContext().put("list", list);
		
		if("admin".equals(type)) {
			return INPUT;
		}else {
			return SUCCESS;
		}
		
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	

}
