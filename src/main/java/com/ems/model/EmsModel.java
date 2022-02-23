package com.ems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String mobile;

	public EmsModel() {
		super();
	}

	public EmsModel(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public EmsModel(long id, String name, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
