
public class Demo<R> {
    private R data;

	public R getData() {
		return data;
	}

	public void setData(R data) {
		this.data = data;
	}
    
	public Demo(R data) {
	}
	

	
	public static void name(String[] args) {
		Demo <String>d1 = new Demo<String>("Hello");
		System.out.println(d1.getData());
		
		Demo <Integer>d2 = new Demo<Integer>(100);
		System.out.println(d2.getData());
		
	}
}
