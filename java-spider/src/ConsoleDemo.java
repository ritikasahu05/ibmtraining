import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = console.next();
		System.out.println("Enter mobile: ");
		String mobile = console.next();
		System.out.println("Enter email: ");
		String email= console.next();
		
		//Name regex
	    String nameRegex = "[A-Z] [a-z] {4,}";
	    System.out.println(name.matches(nameRegex));
		System.out.println("Name: "+name);
		
		//Mobile regex
		String mobileRegex = "[7-9] [1] [0-9] {10}";
		System.out.println(mobile.matches(mobileRegex));
		System.out.println("Mobile: "+mobile);
		
		//Email regex
		String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		System.out.println(email.matches(emailRegex));
		System.out.println("Email: " +email);
		
		
	}

}
