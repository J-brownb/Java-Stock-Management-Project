import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 
import java.io.IOException;
public class UpdateQty {
public static void update(String[] args) throws IOException {
	
	
//scan the items.txt file 
	Scanner s = new Scanner(new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt"));
//create an array list with each new line of the items.txt file 
	ArrayList<String> list = new ArrayList<String>();
	while (s.hasNextLine()){
	    list.add(s.nextLine());
	}
	s.close();
	
//print the items that are currently within the array list called 'string' using a for loop
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
    //collect old qty for updating later on
    String oldqtystring = productdetail.get(3);
    int oldqty = Integer.parseInt(oldqtystring);
    

//ask for new stock qty, save new qty inputted by user as new variable (new qty) 
	System.out.print("\n" + "Please Enter the New Qauntity for Item " + (Item) + ":"+ "\n");
	int newqty = input.nextInt(); 
//setting up new string called productstrng based on newqty variable, set qty in arraylist to match this
	String productstrng = String.valueOf(newqty);
    productdetail.set(3, productstrng);
	System.out.println("New item details: " + productdetail + "\n" + "Your change has been accepted and your Items.txt file has been updated! \n");

	//overwrite current arraylist item with new details inputted by user, remove square brackets on either side
	list.set(Item, "" + (productdetail.toString().substring(1, productdetail.toString().length() - 1)));
		  
	//write over items.txt file with new info, use for loop to loop through each line of array list
	FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt");
	  myWriter.write("id,description,unitPrice,qtyInStock,totalPrice" + System.getProperty( "line.separator" ));
	for (int i=1; i<list.size(); i++) {
		  curr = list.get(i);
		  myWriter.write(curr + System.getProperty( "line.separator" ));
		}
	myWriter.close();
	
    if (oldqty > newqty) {
    	
    	//working out amount sold by subtracting new qty from old qty
    	int qtysold = oldqty - newqty;
    	//working out stock remaining by using newqty value given by user
    	int stockremaining = newqty;
    	//taking ID from array list  	
    	String id = productdetail.get(0);
    	//taking desc from array list
    	String desc = productdetail.get(1);
    	//taking amount per unit from array list and converting to double
    	String amountstrng = productdetail.get(2);
    	double cost = Double.parseDouble(amountstrng); 
    	//working out amount of revenue by multiplying cost per unit by qty sold 
    	double amount = cost * qtysold;
    	//writing all this as an entry to transactions.txt   	
    	
    	FileWriter myWriter2 = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt", true);
    	myWriter2.write(id + "," + desc + "," + qtysold + "," + amount + "," + stockremaining + ",Updated" + System.getProperty( "line.separator" ));
    	myWriter2.close();


     } else {
    	 
    	//taking ID from array list  	
     	String id = productdetail.get(0);
     	//taking desc from array list
     	String desc = productdetail.get(1);
     	//qty sold will be 0 as new qty is larger than oldqty
     	//amount will be 0 as no revenue is created 
    	//stockremaining is simply the user inputted value 'newqty'
    	//writing all this as an entry to transactions.txt   	
    	FileWriter myWriter4 = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt", true);
    	myWriter4.write(id + "," + desc + "," + "0" + "," + "0" + "," + newqty + ",Updated" + System.getProperty( "line.separator" ));
    	myWriter4.close();
     	
	}
  	
    	}}
    	
	
	


	//WORKS BUT THERE ARE SPACES IN THE EDITED ARRAY LIST ITEM

