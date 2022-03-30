import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Exit {
public static void exitSequence(String[] args) throws IOException {

	
	//scan the items.txt file 
		Scanner s = new Scanner(new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt"));
	//create an array list with each new line of the items.txt file 
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()){
		    list.add(s.nextLine());
		}
		s.close();
		
		for (int i=1; i<list.size(); i++) {
			  String curr = list.get(i);


	
				
    //creating a new file called daily transaction report.txt
File myObj2 = new File ("C:\\Users\\Jonny\\OneDrive\\Desktop\\DailyTransactionReport.txt"); 
if (myObj2.createNewFile()) {
	
	//writing the data from the transactions.txt report to the file 
	FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\DailyTransactionReport.txt");
	myWriter.write("id,description,qtySold,amount,StockRemaining,transactionType"+ System.getProperty( "line.separator" ));
	for (i=1; i<list.size(); i++) {
		  curr = list.get(i);
		  myWriter.write(curr + System.getProperty( "line.separator" ));
		}
	myWriter.close();
	
	
	System.out.println("Exiting.. A Daily Transactions Report Can Be Found On Your Desktop");
	System.out.println(list);


	//wiping the transactions.txt report so it can be used for the next program run
	FileWriter myWriter2 = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt");
	myWriter2.write("" + System.getProperty( "line.separator" ));
	myWriter2.close();
	System.out.println("Exiting.. Your Transactions.txt File Has Now Been Wiped");

	//if the file already exists, user is notified, therefore file wont be overwritten or deleted 
} else {
	System.out.println("File 'DailyTransactionsReport.txt' already exists, please rename or delete and try again");
}
}}
}

