package com.luv2code.MiniProject.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="fid",unique = true)	
	private Integer enroll_num;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="mname")
	private String mname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pass")
	private String pass;
	
	@Column(name="contact_num")
	private String contact_1;
	
	@Column(name="alternate_contact")
	private String contact_2;
	
	

	public Faculty() {
		super();
	}



	public Faculty(Integer enroll_num, String fname, String mname, String lname, String email, String pass,
			String contact_1, String contact_2) {
		super();
		this.enroll_num = enroll_num;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.contact_1 = contact_1;
		this.contact_2 = contact_2;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getEnroll_num() {
		return enroll_num;
	}



	public void setEnroll_num(Integer enroll_num) {
		this.enroll_num = enroll_num;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getMname() {
		return mname;
	}



	public void setMname(String mname) {
		this.mname = mname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPass() {
		return pass;
	}



	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getContact_1() {
		return contact_1;
	}



	public void setContact_1(String contact_1) {
		this.contact_1 = contact_1;
	}



	public String getContact_2() {
		return contact_2;
	}



	public void setContact_2(String contact_2) {
		this.contact_2 = contact_2;
	}
	
	
	
	
	
}
