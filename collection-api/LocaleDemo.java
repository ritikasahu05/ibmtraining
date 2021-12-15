import java.util.Locale;
import java.util.ResourceBundle;
public class LocaleDemo {

	public static void main(String[] args) {
		//ResourceBundle msgs = ResourceBundle.getBundle("msgs");
		
		//ResourceBundle msgs = ResourceBundle.getBundle("msgs", Locale.FRENCH);
		
		Locale hindi = new Locale("hi");
		ResourceBundle msgs = ResourceBundle.getBundle("msgs", hindi);
		System.out.println(msgs.getString("greeting"));
		System.out.println(msgs.getString("message"));

	}

}
