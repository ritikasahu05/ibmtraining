
public class TestAlfa {
	public static void main(String[] args) {
		Alfa a= new Alfa();      //Alfa Constructor
		a.demo();                //Alfa Demo
		
		Beta b= new Beta();      //Alfa Constructor    Beta Constructor
		b.test();                //Beta Test
		b.demo();                //Beta Demo
		
		Alfa ab=b;                
		ab.demo();               //Beta Demo
		//ab.test();             //Illegal-Invalid statement
		
		Beta ba= (Beta) ab;      
		ba.demo();               //Beta Demo
		ba.test();               //Beta Test
	}

}
