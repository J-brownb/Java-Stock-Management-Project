import java.io.File;
import java.io.IOException;
import java.util.Scanner; 
public class PrintTransactionsReport {
public static void printReport(String[] args) throws IOException {

	//reading contents of transactions.txt file into data variable 
	File myObj = new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt");
	Scanner myReader = new Scanner(myObj);
	while (myReader.hasNextLine()) {
	String data = myReader.nextLine();
	//printing data variable 
	System.out.println(data);
		}

	//closing reader
	myReader.close();
	
	System.out.print("\n Report Printed");	

	//prompt new action from user 
	System.out.println("\nWhat Would You Like To Do Next? \n");
	Store.main(args); 
	
}}
	
	