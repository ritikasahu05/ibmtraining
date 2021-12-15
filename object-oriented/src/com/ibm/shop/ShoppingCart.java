package com.ibm.shop;

import java.util.ArrayList;

public class ShoppingCart {
	private Product[] cart;
	private double total;
	private int idx;

	public ShoppingCart() {
		cart = new Product[5];
		
		ArrayList<String> cart = new ArrayList<String>();
		cart.add("iWatch");
		cart.add("Google Pixel");
		cart.add("iPhone 13");
		cart.add(2, "Microsoft Xbox");
		cart.add("Thinkpad");
		
		for(int i=0; i<cart.size(); i++)
            System.out.print(cart.get(i)+ "\t");
	}

	public void addToCart(Product p) throws ShoppingException {
		if (idx == 5)
			System.out.println("Your cart is full.");
		else if (p.getStock() == 0)
			System.out.println("Sorry! Product out of stock.");
		else {
			cart[idx] = p;
			idx++;
			total += p.getPrice();
			p.setStock(p.getStock() - 1);
			System.out.println(p.getName() + " added to cart.");
		}
	}

	public void checkout() {
		System.out.println("Product in your cart");
		for (int i = 0; i < idx; i++)
			cart[i].print();
		// Print list of products
		System.out.println("Cart Total:Rs. " + total);
	}

}
