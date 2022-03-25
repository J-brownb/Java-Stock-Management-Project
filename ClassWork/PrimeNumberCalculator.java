//write a program that finds the prime numbers between two values 

package uk.ac.uos.i2p.s223358;

public class PrimeNumberCalculator {

 public static void main(String[] args) {

    //define two integers, lower and higher 
    int lower = 1, upper = 10;

    //repeat prime checker as long as lower number is smaller than upper number
    for (int i = lower; i <= upper; i++)
    //print prime checker i value if successful 
      if (primeChecker(i))
        System.out.print(i + " ");
  }

  static boolean primeChecker(int n) {
	  
    //if the number is 1, it is not prime 
    if (n == 1)
      return false;

    //for loop to check if i is smaller than n, increment 1 to i each time 
    for (int i = 2; i < n; i++) {
    //Check if number is prime using modulus
      if (n % i == 0)
        return false;
    }
    return true;
  }
}
