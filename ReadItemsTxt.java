package uk.ac.uos.i2p.s223358;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class ReadItemsTxt {
public static void main(String[] args) {

	try { 
File myObj = new File("C:\\Users\\Jonny\\OneDrive\\Desktop\\GitHub\\I2P\\Assignment\\assignmentfori2p\\items.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
System.out.println(data);
	}

myReader.close();
} catch (FileNotFoundException e) {
	System.out.println("An Error Occured.");
e.printStackTrace();
}
}
}
