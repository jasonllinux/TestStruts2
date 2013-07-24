package com.jasonllinux.struts.action;

import com.jasonllinux.struts.dao.AdminDAO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAdminAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String tip;
	
	public String deleteAdmin() {
		AdminDAO dao = new AdminDAO();
		boolean flag = dao.deleteAdmin(id);
		
		if(flag) {
			this.tip = "delete sucess";
			return SUCCESS;
		}else {
			
			this.tip = "delete failed";
			
			return ERROR;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	
	

}
