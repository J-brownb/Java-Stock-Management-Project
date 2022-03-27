package uk.ac.uos.i2p.s223358;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 
import java.io.IOException;
public class UpdateQty {
public static void main(String[] args) throws IOException {
		
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
	System.out.println("New item details " + productdetail);

//replace current item qty with new item qty 
	
	list.set(Item, "" + (productdetail.toString().substring(1, productdetail.toString().length() - 1)));

}}
			//myWriter is a constructor 
 
//	  FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt", true);
//	  for (int i=1; i<list.size(); i++) {
//		  String curr2 = list.get(i);
//		  myWriter.write(curr2);
//		  
//	  myWriter.close();
//	  
//	  
//	}}}
//




    
    
    
    
    
    
    

//	//creating a strng called curr made up of the item that the user chose 
//	String curr = list.get(Item);
//	//splitting the comma seperate values in the strng into an array
//	List<String> productdetails = Arrays.asList(curr.split(","));
//	//telling the user how many are currently in stock
//    System.out.println("There are currently " + productdetails.get(3) + " in stock");

	
	 //asking user for new quantity, saving this as variable 'newqty'

	
//	productdetails[2] = 9;


	
	

	
	//1.isolating the Item we want to edit by making it into a new array list
	//then trying to print the first value in the array, but still returns the whole line 
	//because it's treating the array as one singular item, that's why it doesn't work 

//	      String curr = list.get(Item);      //defining new string curr as item that was selected by user from list arraylist
//	      ArrayList<String> selected = new ArrayList<String>(); //creating new array list called 'selected'
//	      selected.add(curr); //adding curr string to array list
//	        System.out.println(selected.get(1)); //printing 1st position of array list
//
//	}}

   //2. trying to use the ArrayList to replace specific element in ArrayList 
   // Error message Index -1 out of bounds for length 10
		    
//    int index = list.indexOf("1");
//    list.set(index, "2");
//    System.out.println(list);
//	}}

	//3. Use Curr variable to isolate specific term in the array list item the user has chosen (list.get(Item)
	//Found out it works in characters, so the qty in stock (12) for Item 5 appears at character 19
	
//		  String curr = list.get(Item);
//		    System.out.println(curr.indexOf("12"));
//    
//	  
//		}
//
//}

//4. Use curr variable to isolate specific term in array list, just prints the whole array :( 
// printing out array length, it's only being treated as one item in there, commas not seperating them? 
	
//	String[]curr = {list.get(Item)};
//	System.out.println(curr.length);
//
//	
//	
//	}}

			
			
			


	

	
	
	




	
	
//    String curr = list.get(Item);
//    int index = list.indexOf("item" + newqty);
//    list.set(index, "hi");
 
	
