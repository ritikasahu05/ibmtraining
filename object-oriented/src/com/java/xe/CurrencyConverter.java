package com.java.xe;

public class CurrencyConverter {

	public double convert(double amount, Currency source_currency, Currency target_currency) {
		double rate = target_currency.dollarValue() / source_currency.dollarValue();
		return rate*amount;
	}
}
