import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner; 
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
	int Item = input.nextInt(); 

//print the item that the user chose to update
	System.out.print("\n" + "You Chose to Remove Item Number " + (Item) + "\n" + "\n");

//remove 'item' from the arraylist 'list'
	list.remove(Item);
	
//write the updated ArrayList to the items.txt file using a for loop
	FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt");
	  myWriter.write("id,description,unitPrice,qtyInStock,totalPrice" + System.getProperty( "line.separator" ));
	for (int i=1; i<list.size(); i++) {
		  String curr = list.get(i);
		  myWriter.write(curr + System.getProperty( "line.separator" ));
		}
	myWriter.close();
	
}}
