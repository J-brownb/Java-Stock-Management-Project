package uk.ac.uos.i2p.s223358;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner; // program uses class Scanner
import java.io.IOException;
public class AddItem {
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
String Description = input.nextLine();

//Taking the Price Per Unit
System.out.print("Enter Price Per Unit:"); 
double unitPrice = input.nextDouble(); 

//Taking the Quantity 
System.out.print("Enter How Many Are In Stock:"); 
int qtyInStock = input.nextInt(); 

//Calculating Total Price 
double totalPrice = qtyInStock * unitPrice;

//rounding the total price to two decimal points, so we don't get a long recurring number
double roundedTotalPrice = Math.round(totalPrice*100.0)/100.0;
System.out.print("Total Price Is: " + roundedTotalPrice + "\n");

//Writing to the items.txt file and the transactions.txt file
myWriter.write(ID + "," + Description + "," +  unitPrice + "," +  qtyInStock + "," +  roundedTotalPrice + System.getProperty( "line.separator" ));
//Writing new line to trans.txt file, qty sold is 0 as just been added 
myWriter2.write(ID + "," + Description + "," + "0" + "," + roundedTotalPrice + "," + qtyInStock + ",Created (added)" + System.getProperty( "line.separator" ));
myWriter2.close();
myWriter.close();


//prompt new action from user 
System.out.println("\nWhat Would You Like To Do Next? \n");
Store.main(null); 

	} catch (IOException e) {
	System.out.println("Error");
e.printStackTrace();

}}}




