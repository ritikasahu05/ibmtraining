

import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {

	
		Bank s1 = AccountFactory.openAccount("Lili", "Savings");
		try{
			s1.withdraw(100);
		}
		catch(BalanceException e) {
			//e.printStackTrace();//For developers to trouble shoot problem
			//System.out.println(e);// For logging and audit application 
            System.out.println(e.getMessage());// For end users
		}
	}
}
