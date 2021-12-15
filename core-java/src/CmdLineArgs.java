
public class CmdLineArgs {

	public static void main(String[] args) {
		int sum=0;
		//for (int i = 0; i < args.length; i++) {
	    //System.out.println(args[i]);
		//}
         for (String s : args) {
        	 sum+= Integer.parseInt(s);
			
		}
         System.out.println("Total "+ sum);
         int x = 10;//Primitive variable
         Integer obj = x; //Boxing
         int z = obj; //Unboxing
         
         System.out.println(x + obj * z);
         
	}
       
}
