

import com.java.xe.Dollar;
import com.java.xe.Rupee;
import com.java.xe.CurrencyConverter;


public class TestCurrency {

	public static void main(String[] args) {
		Dollar usd=new Dollar();
		Rupee inr= new Rupee();
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println(cc.convert(100, usd, inr));
		System.out.println(cc.convert(3, inr, usd));
		
		
	}

}
