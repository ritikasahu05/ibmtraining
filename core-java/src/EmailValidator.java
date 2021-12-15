
public class EmailValidator {
    /* There should be one and only 1 occurrences of @ and .
     * min 4 chars before @
     * min 3 char between @ and .
     * min 2 chars after. */
	public static void main(String[] args) {
		String email = "ritika@gmail.com";
		int a=email.indexOf('@');
		int b=email.indexOf('.');
		
		if(a==email.lastIndexOf('@') && b==email.lastIndexOf('.') && a>3 
		&& b>(a+3) && email.length()>(a+2))
			System.out.println("Valid Email");
		else 
			System.out.println("Invalid Email");
	}
	}