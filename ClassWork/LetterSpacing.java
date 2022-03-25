package uk.ac.uos.i2p.s223358;

import java.util.Scanner; 
public class LetterSpacing {
    public static void main(String[] args) {
    	
    	//collect user input 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your message --> ");
        String message = scanner.nextLine();
        
        //print int position + space 
    	int i = 0;
    	while (i < 11) {
        System.out.print(message.charAt(i) + " ");
        i++;
       }}}
