package com.se.assignment1;

class Order {
	Product[] Pr=new Product[10];
	int counter=0;
	String Cid;
	public void addProduct(Product P1){
		Pr[counter]=P1;
		counter++;
	}
	public int totalPrice(){
		int sum=0;
		for(int i=0;i<counter;i++){
			sum=Pr[i].price+sum;
		}
		return sum;
	}
	Order(String C1){
		Cid=C1;
	}

}
