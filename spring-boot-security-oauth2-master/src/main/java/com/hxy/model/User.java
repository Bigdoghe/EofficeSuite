package com.hxy.model;

import java.sql.Timestamp;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "users")
@Entity
public class User {
	@Id // @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String firstname;

	@Column(name = "middle_name")
	private String middlename;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "email")
	private String emailaddress;

	@Column(name = "designation")
	private String designation;

	@Column(name = "joined_date")
	private Date joined_date;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	@JsonIgnore
	private String password;

	@Column(name = "created_at")
	private Timestamp createdat;

	@Column(name = "updated_at")
	private Timestamp updateat;

	@Column(name = "remember_token")
	private String remember_token;



	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setJoined_date(Date joined_date) {
		this.joined_date = joined_date;
	}

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
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


	public Timestamp getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Timestamp createdat) {
		this.createdat = createdat;
	}

	public Timestamp getUpdateat() {
		return updateat;
	}

	public void setUpdateat(Timestamp updateat) {
		this.updateat = updateat;
	}

	public String getRemember_token() {
		return remember_token;
	}

	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}

	public User(int id, String firstname, String middlename, String lastname, String emailaddress, String designation,
			Date joined_date, String username, String password, Timestamp createdat, Timestamp updateat,
			String remember_token) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.emailaddress = emailaddress;
		this.designation = designation;
		this.joined_date = joined_date;
		this.username = username;
		this.password = password;
		this.createdat = createdat;
		this.updateat = updateat;
		this.remember_token = remember_token;
	}



	
	
	
}
