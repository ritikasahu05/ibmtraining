
public class ChildDemo<R, S> extends Demo<R> {
	private S temp;
	
	public ChildDemo(R data, S temp) {
		super(data);
		this.temp = temp;
	}

	public S getTemp() {
		return temp;
	}

	public void setTemp(S temp) {
		this.temp = temp;
	}
	
	public static void main() {
		
	}

	

}
