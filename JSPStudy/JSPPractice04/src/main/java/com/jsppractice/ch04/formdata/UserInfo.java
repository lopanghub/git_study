package com.jsppractice.ch04.formdata;

public class UserInfo {
	private String name;
	private String id;
	private String pass;
	private String gender;
	private String nMail;
	private String aMail;
	private String iMail;
	private String job;
	
	public UserInfo(){}

	public UserInfo(String name, String id, String pass, String gender, String nMail, String aMail, String iMail,
			String job) {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.gender = gender;
		this.nMail = nMail;
		this.aMail = aMail;
		this.iMail = iMail;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getnMail() {
		return nMail;
	}

	public void setnMail(String nMail) {
		this.nMail = nMail;
	}

	public String getaMail() {
		return aMail;
	}

	public void setaMail(String aMail) {
		this.aMail = aMail;
	}

	public String getiMail() {
		return iMail;
	}

	public void setiMail(String iMail) {
		this.iMail = iMail;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
