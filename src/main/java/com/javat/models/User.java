package com.javat.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User implements Serializable{
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
	
	@Column(name="userneam", length = 50)
	private String userneam;
	
	@Column(name="password", length = 50)
	private String password;
	
	@Column(name="fullname", length = 50)
	private String fullname;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name=" gender")
	private boolean gender;
	public User() {
		super();
	}
	public User(String username, String password, String fullname, Integer age, boolean gender) {
		super();
		this.userneam = username;
		this.password = password;
		this.fullname = fullname;
		this.age = age;
		this.gender = gender;
	}
	public String getUsername() {
		return userneam;
	}
	public void setUsername(String username) {
		this.userneam = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
