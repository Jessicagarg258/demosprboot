package com.mph.demosprboot.entity;

import java.sql.Date;
import java.util.List;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eid;
	private String ename;
	private String email;
	private String password;
	private String gender;
	private Boolean isMarried;
	@ElementCollection
	private List<String> phoneNo;
	private Date date;

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	public List<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SEmployee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", isMarried=" + isMarried + ", phoneNo=" + phoneNo + ", date=" + date + "]";
	}





}
