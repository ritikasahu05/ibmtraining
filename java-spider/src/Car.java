
public class Car {
    private String model;
    private String[] features;
    
    public Car(String model, String...features) {     //Varargs, it can only be last argument
    	this.model = model;
    	this.features = features;
    }
    
    public void specs() {
    	System.out.println("Features of" +model);
    	for(String f : features)
    		System.out.println("-"+f);
    }
    
    public static void main(String[] args) {
    	Car alto = new Car("Suzuki Alto", "AC", "Music System");
    	alto.specs();
    	
        Car astor = new Car("MG Astor","Keyless","ADAS" );
        astor.specs();
    	
    }
}
