import java.io.File;
import java.util.ArrayList;
import java.util.Scanner; 
import java.io.IOException;
public class GenerateID {
public static void newID(String[] args) throws IOException {
	
	
//scan the items.txt file 
	Scanner s = new Scanner(new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt"));
//create an array list with each new line of the items.txt file 
	ArrayList<String> list = new ArrayList<String>();
	while (s.hasNextLine()){
	    list.add(s.nextLine());
	}
	s.close();
	
	
	int NumberofItems = list.size(); 
	String ID = String.format("%05d", NumberofItems);
	System.out.println(ID);
	  
	  

	}
  	
    	}
    	
