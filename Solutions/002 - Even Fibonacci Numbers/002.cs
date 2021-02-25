/*
 * Project Euler
 * Problem 2 - C#
 *
 * Jordan Lanius
 * jordan.lanius@gmail.com
 *
 * - Even Fibonacci Numbers -
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 *          1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 */

using System;

class Fibonacci {
  /* Main Function */
  static void Main() {
    // Problem Constants
    const int TERM_ONE = 1;
    const int TERM_TWO = 2;
    const int MAX_NUMBER = 4000000;
    
    // Primary function call
    int answer = EvenFibonacciSum(TERM_ONE, TERM_TWO, MAX_NUMBER);
    
    // Display answer
    Console.WriteLine(answer);
  }
  
  /* Find sum of even values in Fibonacci sequence */
  static int EvenFibonacciSum(int num1, int num2, int maxNumber) {
    // Variables
    int temp = 0;
    int sum = 0;
    
    // Add first number if even
    if ((num1 % 2) == 0) {
      sum += num1;
    }
    
    // Loop until sequence exceeds MAX_NUMBER
    while (num2 <= maxNumber) {
      // Add second number if even
      if ((num2 % 2) == 0) {
        sum += num2;
      }
      
      // Find next Fibonacci number
      temp = num1 + num2;
      num1 = num2;
      num2 = temp;
    }
    
    // Return sum
    return sum;
  }
}