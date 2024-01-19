package com.solid.entity;

import com.solid.interfaces.UserActions;

public class Admin implements UserActions{
	private String adminId;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public Admin() {
		adminId = "AD001";
	}
	
}
