import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class ReadFromFile {
public static void main(String[] args) {

	try { 
File myObj = new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\Holly.doc");
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
