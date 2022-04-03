import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner; // program uses class Scanner
import java.io.IOException;
public class WriteItemsTxt {
public static void newItem() {

	try { 
	
//myWriter is a constructor 
FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt", true);
FileWriter myWriter2 = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt", true);

//scan the items.txt file 
Scanner s = new Scanner(new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt"));
//create an array list with each new line of the items.txt file 
	ArrayList<String> list = new ArrayList<String>();
	while (s.hasNextLine()){
	    list.add(s.nextLine());
	}
	s.close();
	
	//create the ID from size of array 
	int NumberofItems = list.size(); 
	//add leading zeros 
	String ID = String.format("%05d", NumberofItems);
	System.out.println("Your New Item ID Is " + ID);
	  
Scanner input = new Scanner(System.in);

//Taking the Description 
System.out.print("Enter Product Description:");
Scanner in = new Scanner(System.in);
String Description = in.nextLine();

//Taking the Price Per Unit
System.out.print("Enter Price Per Unit:"); 
double unitPrice = input.nextInt(); 

//Taking the Quantity 
System.out.print("Enter How Many Are In Stock:"); 
int qtyInStock = input.nextInt(); 

//Calculating Total Price 
double totalPrice = qtyInStock * unitPrice;
System.out.print("Total Price Is: " + totalPrice + "\n"); 

//Writing to the items.txt file and the transactions.txt file
myWriter.write(ID + "," + Description + "," +  unitPrice + "," +  qtyInStock + "," +  totalPrice + System.getProperty( "line.separator" ));
myWriter2.write(ID + "," + Description + "," +  unitPrice + "," +  qtyInStock + "," +  totalPrice + System.getProperty( "line.separator" ));
myWriter2.close();
myWriter.close();
	} catch (IOException e) {
	System.out.println("Error");
e.printStackTrace();

}}}




