package com.se.assignment1;

class User {
	private String name;
	private String id;
	private String password;
	public String getName() {
		return name;
	}
	
	public User(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "User name=" + name + ", id=" + id + " ";
	}
	public boolean checkValidation(String password){
		boolean p=false;
		if(password==this.getPassword())
		{
			p=true;
		}
		return p;
	}
}
