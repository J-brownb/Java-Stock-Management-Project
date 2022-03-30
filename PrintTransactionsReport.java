import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
public class PrintTransactionsReport {
public static void printReport(String[] args) throws IOException {


		FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt");
		myWriter.write("id,description,qtySold,amount,stockRemaining,transactionType " + System.getProperty( "line.separator" ));
		myWriter.close();
		System.out.println("Success");
			System.out.println("Here's Your Report: \n");

		
		}
			}

		
	