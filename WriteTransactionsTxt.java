import java.io.FileWriter;
import java.io.IOException;
public class WriteTransactionsTxt {
public static void main(String[] args) {

	try { 
	
//myWriter is a constructor 
FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\Uni\\Introduction To Programming\\Assignment\\I2P-Assignment-starter-code\\transactions.txt", true);
myWriter.write("hello " + System.getProperty( "line.separator" ));
myWriter.close();
System.out.println("Success");
	} catch (IOException e) {
	System.out.println("Error");
e.printStackTrace();
}
	}
}

