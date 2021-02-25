/*
 * Project Euler
 * Problem 4 - Java
 *
 * Jordan Lanius
 * jordan.lanius@gmail.com
 *
 * - Largest Palindrome Product -
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
 
public class Main {
  /* Main Function */
	public static void main(String[] args) {
	  // Problem Constants
	  final int DIGITS = 3;
	  
	  // Primary function call
	  int answer = largestPalinProd(DIGITS);
	  
	  // Display answer
		System.out.println(answer);
	}
	
	/* Find largest palindrome product */
	public static int largestPalinProd(int digits) {
	  // Variables
	  int largestPalin = 0;
	  int product;
	  int max, min;
	  
	  // Determine max and min factors
	  max = (int)Math.pow(10, digits) - 1;
	  min = (int)Math.pow(10, digits - 1);
	  
	  // Loop through all n-digit numbers
	  for (int x = max; x >= min; x--) {
	    for (int y = max; y >= min; y--) {
	      product = x * y;
	      
	      // Test if product is a palindrome only if product is larger
	      if (product > largestPalin) {
	        if (isPalindrome(product)) {
	          // Replace largestPalin with the new larger palindrome
	          largestPalin = product;
	        }
	      }
	    }
	  }
	  
	  // Return largest palindrome product
	  return largestPalin;
	}
	
	/* Test if a number is a palindrome */
	public static boolean isPalindrome(int number) {
	  // Variables
	  int original = number;
	  int reverse = 0;
	  int remainder;
	  
	  // Reverse number
	  while (number != 0) {
	    remainder = number % 10;
	    reverse = (reverse * 10) + remainder;
	    number /= 10;
	  }
	  
	  // Compare original and reversed numbers
	  if (original == reverse) {
	    return true;
	  } else {
	    return false;
	  }
	}
}