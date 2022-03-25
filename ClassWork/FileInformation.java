package uk.ac.uos.i2p.s223358;

import java.io.File;
import java.io.IOException;

public class FileInformation {
public static void main(String[] args) {

File myObj = new File ("C:\\Users\\Jonny\\OneDrive\\Desktop\\Jack.doc");
if (myObj.exists()) {
	System.out.println("File Name: " + myObj.getName());
	System.out.println("Absolute Path: " + myObj.getAbsolutePath());
	System.out.println("Writeable: " + myObj.canWrite());
	System.out.println("Readable: " + myObj.canRead());
	System.out.println("File Size In Bytes: " + myObj.length());
} else {
		System.out.println("The File Does Not Exist.");

	}


}

}