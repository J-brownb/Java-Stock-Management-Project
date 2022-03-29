import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class PrintTransactionsReport {
public static void printReport(String[] args) throws FileNotFoundException {

System.out.println("Here's Your Report: \n");
File myObj = new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
System.out.println(data);
	}

myReader.close();
} }