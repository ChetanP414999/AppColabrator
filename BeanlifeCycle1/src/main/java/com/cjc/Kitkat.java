package com.cjc;

public class Kitkat {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	
	public Kitkat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kitkat [price=" + price + "]";
	}

	public void init()
	{
		System.out.println("inside init method");
		
	}
	public void destroy()
	{
		
		System.out.println("inside destroy method");
	}
	
	
	
}
