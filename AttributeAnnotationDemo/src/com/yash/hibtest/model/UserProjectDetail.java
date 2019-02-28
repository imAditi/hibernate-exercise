package com.yash.hibtest.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserProjectDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "title")
	private String title;
	private int duration;

	@AttributeOverride(name = "type", column = @Column(name = "Internal"))
	private ProjectType internal;
	@AttributeOverride(name = "type", column = @Column(name = "External"))
	private ProjectType external;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public ProjectType getInternal() {
		return internal;
	}
	public void setInternal(ProjectType internal) {
		this.internal = internal;
	}
	public ProjectType getExternal() {
		return external;
	}
	public void setExternal(ProjectType external) {
		this.external = external;
	}

	
	

}
