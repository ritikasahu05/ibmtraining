package com.ibm.stock;

public class StockSingleton {

	private static Stock stk;
	
	private StockSingleton() {
	}
	
	public static Stock getStock() {
		if(stk==null)
			stk=new Stock();
		
		return stk;
	}
}
