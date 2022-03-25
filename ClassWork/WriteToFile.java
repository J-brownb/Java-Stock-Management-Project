package uk.ac.uos.i2p.s223358;

import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
public static void main(String[] args) {

	try { 
	
//myWriter is a constructor 
FileWriter myWriter = new FileWriter ("C:\\Users\\Jonny\\OneDrive\\Desktop\\Holly.doc");
myWriter.write("hello");
myWriter.close();
System.out.println("Success");
	} catch (IOException e) {
	System.out.println("Error");
e.printStackTrace();
}
	}
}