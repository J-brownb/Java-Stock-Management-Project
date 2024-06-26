import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
public class RemoveItem {
	public static void deleteItem(String[] args) throws IOException {

//scan the items.txt file 
	Scanner s = new Scanner(new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt"));
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
	System.out.print("\n" + "Choose Which Item You Want To Remove (Use a Single Number):" + "\n");
	int item = input.nextInt(); 

//print the item that the user chose to update
	System.out.print("\n" + "You Chose to Remove Item Number " + (item) + "\n" + "\n" + "Your Items.txt and Transactions.txt files have been updated!");
		
	//declare string curr as the item that the user selected (full row of details)
		String curr = list.get(item);
		
	//use split to break the string into an array, new item at every comma
		String[] productDetails = curr.split(",");
		
	//convert to array list
		List<String> productDetailsArray = Arrays.asList(productDetails);
		ArrayList<String> productDetail = new ArrayList<String>(productDetailsArray);	
	
    	    
		//ID stays as is
		//Desc stays as is 
		//qty sold is 0 as product is being removed 
	    productDetail.set(2, "0");
	    //getting the qty 
	    String qtyString = productDetail.get(3);
	    //set the qty at pos 4 in the new array 
	    productDetail.set(4, qtyString);
	    //set amount as 0 as being removed
	    productDetail.set(3, "0");
	    //set transaction type field as removed
	    productDetail.add(5, "Removed");
	    
	    
		//add new array to transactions.txt file, remove square brackets on either side
	    FileWriter myWriter2 = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\transactions.txt", true);
    	myWriter2.write(productDetail.toString().substring(1, productDetail.toString().length() - 1 ) + System.getProperty( "line.separator" ));
    	myWriter2.close();

		
//remove 'item' from the arraylist 'list'
list.remove(item);


//write the updated ArrayList to the items.txt file using a for loop
	FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt");
	  myWriter.write("id,description,unitPrice,qtyInStock,totalPrice" + System.getProperty( "line.separator" ));
	for (int i=1; i<list.size(); i++) {
		  String curr1 = list.get(i);
		  myWriter.write(curr1 + System.getProperty( "line.separator" ));
		}
	myWriter.close();
    	//prompt new action from user 
    	System.out.println("\nWhat Would You Like To Do Next? \n"); 
    	Store.main(args); 
    	
    	
	    
	}}
	    
   



	    
