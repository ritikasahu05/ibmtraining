import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {

	public static void main(String[] args) throws Exception {
		/*
		 * Person p1 = new Person("Ritika", 24); System.out.println(p1);
		 * 
		 * Class pc = p1.getClass();
		 */
		// Loading a Java class manually

		Class pc = Class.forName("Person");
		System.out.println(pc.getName());

		Constructor[] constructors = pc.getConstructors();
		System.out.println("--List of constructors");
		for (Constructor c : constructors)
			System.out.println(c);

		Method[] methods = pc.getMethods();
		System.out.println("--List of Methods");
		for (Method m : methods)
			System.out.println(m);

		Method[] decmethods = pc.getDeclaredMethods();
		System.out.println("--List of Declared Methods");
		for (Method m : decmethods)
			System.out.println(m);

		Field[] fields = pc.getFields();
		System.out.println("--List of fields");
		for (Field f : fields)
			System.out.println(f);

		Field[] decfields = pc.getDeclaredFields();
		System.out.println("--List of declared fields");
		for (Field f : decfields)
			System.out.println(f);

		// Dynamically instantiating Person Class
		Object obj = constructors[0].newInstance(null);
		System.out.println(obj);

		Method print = pc.getMethod("print", null);
		print.invoke(obj, null);

	}

}
