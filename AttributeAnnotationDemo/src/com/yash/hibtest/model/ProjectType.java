package com.yash.hibtest.model;

import javax.persistence.Embeddable;

@Embeddable
public class ProjectType {
private String type;


public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
