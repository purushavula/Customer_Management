package com.techpalle.module;

public class Customer 
{

	private String name;
	private String email;
	private String pass;
	private long mobile;
	private String state;
	public Customer( String name, String email, String pass, long mobile, String state) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
		this.state = state;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	


}
