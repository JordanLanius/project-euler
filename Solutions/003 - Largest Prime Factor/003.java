/*
 * Project Euler
 * Problem 3 - Java
 *
 * Jordan Lanius
 * jordan.lanius@gmail.com
 *
 * - Largest Prime Factor -
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Main {
  /* Main Function */
	public static void main(String[] args) {
	  // Problem Constants
	  final long NUMBER = 600851475143L;
	  
	  // Primary function call
	  long answer = largestPrimeFactor(NUMBER);
	  
	  // Display answer
		System.out.println(answer);
	}
	
	/* Find largest prime factor */
	public static long largestPrimeFactor(long num) {
	  // Variables
	  long largestPrime = 0;
	  
	  // Remove all factors of two
	  while ((num % 2) == 0) {
	    largestPrime = 2;
	    num /= 2;
	  }
	  
	  // Loop  through odd numbers until a prime factor is found
	  for (int factor = 3; factor <= Math.sqrt(num); factor += 2) {
	    // Remove all instances of factors found
	    while ((num % factor) == 0) {
	      largestPrime = factor;
	      num /= factor;
	    }
	  }
	  
	  // If the remaining value is greater than 2, it is the largest prime factor
	  if (num > 2) {
      largestPrime = num;
	  }
	  
	  // Return largest prime factor
	  return largestPrime;
	}
}