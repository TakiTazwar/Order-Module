package com.se.assignment1;

class Product {
	String name;
	int id;
	String catagory;
	int price;
	
	
	public Product(String name, int id, String catagory, int price) {
		this.name = name;
		this.id = id;
		this.catagory = catagory;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
