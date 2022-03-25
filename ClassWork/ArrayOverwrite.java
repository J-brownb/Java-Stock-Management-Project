package uk.ac.uos.i2p.s223358;

public class ArrayOverwrite {
public static void main(String[] args) {

//defining array as 1,5
int[] numbers = {1,5};

//calling change and print array method
change(numbers);
printArray(numbers);

}

//change method, changing numbers 1,5 to 66,99
public static void change(int[] numbers){
	numbers [0] = 66; 
	numbers [1] = 99;
}

//print method, printing the array
public static void printArray (int [] numbers) {
	for (int i = 0; i < numbers.length; i++ )
	System.out.print(numbers [i] + " ");
	
}}



