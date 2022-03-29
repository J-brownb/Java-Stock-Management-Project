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
	Scanner s = new Scanner(new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items2.txt"));
//create an array list with each new line of the items.txt file 
	ArrayList<String> list = new ArrayList<String>();
	while (s.hasNextLine()){
	    list.add(s.nextLine());
	}
	s.close(); 
    
    
	System.out.print("Enter Product Description. Example Format 'item1':");
	Scanner in = new Scanner(System.in);
	String Desc = in.nextLine();
	
	if (Desc.length() < 4) {
        System.out.println("\n Sorry, your search term is too broad, use at least 4 characters of text");

	} else {

	
	

    for (String item : list){
        if (item.contains(Desc)){
              System.out.println("\n" + "Success! We have found " + Desc + " within your Items.txt file \n");
              System.out.println("Here are the item details: " + item);
        } else {
            System.out.println("\n Item " + Desc + " was not found" );
            break;
        }
     }
  }
}
}
