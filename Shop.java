package com.se.assignment1;

import java.util.Stack;

public class Shop {
	public static void main(String[] args){
		Admin U1= new Admin("Moin","A-01","hell","3 July,1999");
		Product P1=U1.createProduct("Mobile",01,"Electronics",12000);
		Product P2=U1.createProduct("Laptop",02,"Electronics",40000);
		Product P3=U1.createProduct("Keyboard",04,"Electronics",500);
		Customer C1=new Customer("Klain","C-01","heaven","01751999085",1000);
		Order O1=C1.createOrder();
		O1.addProduct(P1);
		O1.addProduct(P2);
		O1.addProduct(P3);
		
		
		
		
		
		System.out.println(O1.totalPrice());
		
		}
	
		
}
