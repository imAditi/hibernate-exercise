package com.yash.hibtest.model;

import javax.persistence.Entity;

@Entity
public class InternalProject extends Project {

	private String managerName;

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	

}