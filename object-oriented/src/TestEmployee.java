

import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {
	public static void main(String[] args) {
		//Employee emp = new Employee("Alex", 50000.00);
		//e1.Payslip();

		Executive e2 = new Executive("Bob", 30000.00, 4000);
		//e2.Payslip();

		Manager mgr= new Manager("Lili", 50000.00, 3000.00);
		//mgr.Payslip();
		/*Employee emp= mgr;
		System.out.println(mgr.getSal());
		System.out.println(emp.getSal());*/
		
		  showSalary(e2);
		  showSalary(mgr);	  
	}

	
	private static void showSalary(Employee emp) {
		  if(emp instanceof Manager)
			  System.out.println("Manager salary: "+ emp.getSal());
		  else
		      System.out.println("Executive salary: "+emp.getSal());
	   } 
	
	private static void showSalary(Manager mgr) {
		System.out.println("Manager Salary: "+ mgr.getSal());
	}

	private static void showSalary(Executive e2) {
		System.out.println("Executive Salary: "+ e2.getSal());
	}

}
