import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class ReadTransactionsTxt {
public static void main(String[] args) {

	try { 
File myObj = new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\Uni\\Introduction To Programming\\Assignment\\I2P-Assignment-starter-code\\transactions.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
System.out.println(data);
	}

myReader.close();
} catch (FileNotFoundException e) {
	System.out.println("An Error Occured.");
e.printStackTrace();
}
}
}