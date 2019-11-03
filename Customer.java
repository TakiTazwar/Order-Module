package com.se.assignment1;

class Customer extends User{
	private String phone;
	private Account acc=new Account();

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Customer(String name, String id, String password,String phone,int balance) {
		super(name, id, password);
		this.phone=phone;
		this.acc.setBalance(balance);
	}

	public String toString() {
		return  super.toString()+" Customer phone=" + phone + ", Balance=" + acc.getBalance() +" ";
	}
	public Order createOrder(){
		return new Order(this.getId());
	}
	

}
