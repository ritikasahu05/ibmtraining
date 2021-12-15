
import java.io.FileReader;
import java.util.Properties;

public class PropsDemo {
    public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("C:\\Softwares\\Workspace\\collection-api\\Person.txt");
		
		Properties p = new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("city"));
	}
}
