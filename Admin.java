package com.se.assignment1;

class Admin extends User {
	private String joinDate;
	
	
	public String toString() {
		return super.toString()+"Admin joinDate=" + joinDate;
	}

	public Admin(String name, String id, String password,String joinDate) {
		super(name, id, password);
		this.joinDate=joinDate;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public Product createProduct(String name,int id,String catagory,int price){
		return new Product(name,id,catagory,price);
	}
}
