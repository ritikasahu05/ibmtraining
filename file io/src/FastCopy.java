import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastCopy {
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		BufferedInputStream inBuffer = null;
		BufferedOutputStream outBuffer = null;
		try {
			inFile = new FileInputStream("C:\\Users\\002UUJ744\\Documents\\node-v16.13.0-x64.msi"); //21 MB approx
			outFile = new FileOutputStream("C:\\Users\\002UUJ744\\Documents\\node-v16.13.0-x642.msi");
			inBuffer = new BufferedInputStream(inFile, 1024*16); 
			outBuffer = new BufferedOutputStream(outFile, 1024*16);
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while(true) {
				ch = inBuffer.read();
				if(ch == -1) break;
				outBuffer.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in "+(ms2-ms1)+" ms");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				inBuffer.close();
				outBuffer.close();
				inFile.close();
				outFile.close();
			} catch(Exception e) { }
		}
	}
}