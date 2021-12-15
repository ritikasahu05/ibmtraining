
public class ArithmeticDemo {

	public static void main(String[] args) {
	Arithmetic a1=(n, m) -> (Integer)n + (Integer)m;
     System.out.println(a1.sum(10, 20));
     
     Arithmetic a2=(n, m) -> (Double)n + (Double)m;
     System.out.println(a2.sum(12.40, 11.55));
	}

}
