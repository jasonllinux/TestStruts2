package com.jasonllinux.struts.action;

import com.jasonllinux.struts.bean.User;
import com.jasonllinux.struts.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String username;
	private String password;
	private String name;
	private String nic;
	private String sex;
	private int age;
	private String email;
	private String phone;
	private String selfshow;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSelfshow() {
		return selfshow;
	}

	public void setSelfshow(String selfshow) {
		this.selfshow = selfshow;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	
	//update user info
	public String update() {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setNic(nic);
		user.setSex(sex);
		user.setAge(age);
		user.setEmail(email);
		user.setPhone(phone);
		user.setSelfshow(selfshow);
		
		UserDAO dao = new UserDAO();
		int i = dao.update(user);
		
		if (i > 0) {
			return SUCCESS;
		}else {
			this.tip = "udpate failed" ;
			return INPUT;
		}
		
	}

}
