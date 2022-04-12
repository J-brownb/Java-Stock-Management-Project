import java.io.File;
import java.util.ArrayList;
import java.util.Scanner; 
import java.io.IOException;
public class Search {
public static void searchItem(String[] args) throws IOException {
	
	//scan the items.txt file 
		Scanner s = new Scanner(new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt"));
	//create an array list with each new line of the items.txt file 
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()){
		    list.add(s.nextLine());
		}
		s.close();
				
		//Taking the product name or description from the user
		System.out.print("Enter Search Term:");
		Scanner in = new Scanner(System.in);
		String searchTerm = in.nextLine();
    	 System.out.println("\nSearch Completed.. Here are the mentions of " + "'" + searchTerm + "' " + "we found: \n");

         //using a for each loop to iterate over the array list
		for (String s1 : list){
	    	  //looking for the user variable  
	          if (s1.contains(searchTerm)){
	        	//if it contains user variable, we print the line its on 	                
	                System.out.println("found on this line: " + s1);   

	          }}
        System.out.println("\n\nWhat would you like to do next?");
		System.out.println("1. SEARCH AGAIN");
		System.out.println("2. RETURN TO MAIN MENU");
		Scanner input = new Scanner(System.in);
		int userinput = input.nextInt();

		
	
			if (userinput>2 || userinput<1) {
				System.out.println("This doesn't appear to be a valid option...!");
				
			}
			if (userinput == 1)	{
				Search.searchItem(args); 
			}
			else if (userinput == 2) {		
				Store.main(args); 
				System.out.print("\n Item Quantity Updated, your Items.Txt file has been updated");
			}		input.close();
}}

    

