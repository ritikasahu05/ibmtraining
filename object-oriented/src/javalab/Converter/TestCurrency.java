package javalab.Converter;
public class TestCurrency extends Currency {

	public static void main(String[] args) {
		//Currency cc= new Currency(400, "USD","INR", 75.95);
		
		
		
		CurrencyConverter c=new CurrencyConverter();
		c.convert(400,"USD","INR", 75.59);
		c.display();
		
		

	}

}
