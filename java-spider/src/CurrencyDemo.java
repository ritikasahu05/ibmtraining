
public class CurrencyDemo {

	public static void main(String[] args) {
		System.out.println(Currency.convert(100, Currency.USD, Currency.INR));
		System.out.println(Currency.convert(2000, Currency.INR, Currency.USD));
		System.out.println(Currency.convert(100, Currency.AED, Currency.INR));
		System.out.println(Currency.convert(10, Currency.USD, Currency.AED));
		
	}

}
