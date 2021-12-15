package com.ibm.shop;

public class Product {
	private String name;
	private double price;
	private int stock;

	public Product() {

	}

	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public void print() {
		System.out.println("Product Name:" + name);
		System.out.println("Product price: Rs. " + price);
		System.out.println("Product Stock left:" + stock);

	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

}
