package uk.ac.uos.i2p.s223358;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 
import java.io.IOException;
public class UpdateQty {
public static void newItem(String[] args) throws IOException {
	
	
//scan the items.txt file 
	Scanner s = new Scanner(new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items2.txt"));
//create an array list with each new line of the items.txt file 
	ArrayList<String> list = new ArrayList<String>();
	while (s.hasNextLine()){
	    list.add(s.nextLine());
	}
	s.close();
	
//print the items that are currently within the array list called 'string'
	System.out.print("Here's a List of Items Currently Available:" + "\n" + "\n");

//for loop, use increment counter to print array list line by line, variable 'curr' is the individual item 
	for (int i=1; i<list.size(); i++) {
		  String curr = list.get(i);
		  System.out.println(i + ". " + curr);
		}
	
//allow the user to choose the item they want to update, set their choice as variable 'item'
	Scanner input = new Scanner(System.in);
	System.out.print("\n" + "Choose Which Item You Want To Update (Use a Single Number):" + "\n");
	int Item = input.nextInt(); 

	
	
//print the item that the user chose to update
	System.out.print("\n" + "You Chose to Update Item Number " + (Item) + "\n" + "\n");

//declare string curr as the item that the user selected (full row of details)
	String curr = list.get(Item);
	
//use split to break the string into an array, new item at every comma
	String[] productdetails = curr.split(",");
	
//convert to array list
	List<String> productdetailsarray = Arrays.asList(productdetails);
	ArrayList<String> productdetail = new ArrayList<String>(productdetailsarray);
	
//print item name (at pos 0), and current stock levels (at pos 3)
	
    System.out.println("Item name: " + productdetail.get(0));
    System.out.println("Amount currently in stock: " + productdetail.get(3));

//ask for new stock qty 
	System.out.print("\n" + "Please Enter the New Qauntity for Item " + (Item) + ":"+ "\n");
	int newqty = input.nextInt(); 
	String productstrng = String.valueOf(newqty);
    productdetail.set(3, productstrng);
	System.out.println("New item details: " + productdetail + "\n" + "Your change has been accepted and the records have been updated!");


//replace current item qty with new item qty 
	
	list.set(Item, "" + (productdetail.toString().substring(1, productdetail.toString().length() - 1)));
		
	for (int i=1; i<list.size(); i++) {
		  curr = list.get(i);
		  System.out.println(i + ". " + curr);
		}
		  
	
	FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items2.txt");
	  myWriter.write("id,description,unitPrice,qtyInStock,totalPrice" + System.getProperty( "line.separator" ));
	for (int i=1; i<list.size(); i++) {
		  curr = list.get(i);
		  myWriter.write(curr + System.getProperty( "line.separator" ));
		}
	myWriter.close();
	
}}

	//WORKS BUT THERE ARE SPACES IN THE EDITED ARRAY LIST ITEM

