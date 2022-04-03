import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
		 
		System.out.print("Enter Search Term");
		Scanner in = new Scanner(System.in);
		String searchterm = in.nextLine();
	        
	    
        System.out.println(list);

	    
	    
        System.out.println(list.contains(searchterm));
        
		System.out.println(list);
		// find word in String
		boolean val = list.contains(searchterm);
		if(val)
			System.out.println("String found: "+searchterm);
		else 
			System.out.println("string not found");


//prompt new action from user 
System.out.println("\nWhat Would You Like To Do Next? \n");
store.main(args); 

}}
        
            
    
//	System.out.print("Enter Product Description. Example Format 'item1':");
//	Scanner in = new Scanner(System.in);
//	String Desc = in.nextLine();
//	
//	if (Desc.length() < 4) {
//        System.out.println("\n Sorry, your search term is too broad, use at least 4 characters of text");
//    	System.out.print("Enter Product Description. Example Format 'item1':");
//    	in = new Scanner(System.in);
//    	Desc = in.nextLine();
//	} else {
//	
//		if (list.contains(Desc)) {
//	    	System.out.print("Found:");
//			} else {
//		    	System.out.print("Not Found:");
//			}
//	
//	
//	}}}
//		

//     }
//  }
//}
//}
