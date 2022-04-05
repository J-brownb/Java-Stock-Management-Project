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
		


		System.out.print(list + "\n\n");

		
		//Taking the Description 
		System.out.print("Enter Product Description:");
		Scanner in = new Scanner(System.in);
		String var = in.nextLine();

//using a for loop to iterate through 	
	      for (String s1 : list){
	          if (s1.contains(var)){
	                System.out.println(s1);
	          }}}}

		
		
//		  boolean ans = list.contains(var);
//		  
//	        if (ans)
//	            System.out.println("The list contains " + var);
//	        else
//	            System.out.println("The list does not contain " + var);
//	  

		
		
//		System.out.print("Enter Search Term:");
//		Scanner in = new Scanner(System.in);
//		String searchterm = in.nextLine();
		
//		   // prints true
//        System.out.println(data.contains("item1"));
// 
//        // prints false
//    
//
//		}
//}		}}
		

//
//        System.out.println(list);
//
//        System.out.println(searchterm);
//        
//        System.out.println(list.contains(searchterm));
//
//        boolean found = false;
//
//	    
//        for(String x : list){
//        	if(x == searchterm){
//                found = true;
//                break;
//            }
//        }
//        
//        System.out.println(found);



//prompt new action from user 
//System.out.println("\nWhat Would You Like To Do Next? \n");
//store.main(args); 
//
//}}
