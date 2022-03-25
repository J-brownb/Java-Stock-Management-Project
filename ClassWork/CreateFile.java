package uk.ac.uos.i2p.s223358;

import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) {

	try {
File myObj = new File ("C:\\Users\\Jonny\\OneDrive\\Desktop\\Holly.doc");
if (myObj.createNewFile()) {
	System.out.println("File Created:" + myObj.getName());
}else {
	System.out.println("File already exists");
}
	
}	catch (IOException e) {
	System.out.println("An error occured.");
	e.printStackTrace();

}
	}}
