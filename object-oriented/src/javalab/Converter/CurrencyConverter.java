package javalab.Converter;

public class CurrencyConverter {
	
	private double amount;
	private String source_currency;
	private String target_currency;
	private double value;
	
	public CurrencyConverter() {
	}
	
	public CurrencyConverter(double amount, String source_currency, String target_currency, double value) {
		this.amount=amount;
		this.source_currency=source_currency;
		this.target_currency=target_currency;
		this.value=value;
	}

	public double convert(double amount, String source_currency, String target_currency, double value) {
		if (source_currency == "INR" && target_currency == "USD") {
			this.amount = amount / value;
		} else if (source_currency == "USD" && target_currency == "INR") {
			this.amount = amount * value;
		} else {
			System.out.println("Invalid Input.");
		}
		return amount;
	}
	
	public void display() {
		System.out.println("The converted currency is "+ amount);
	}
	
	
}
