/*
 * Project Euler
 * Problem 1 - C
 *
 * Jordan Lanius
 * jordan.lanius@gmail.com
 *
 * - Multiples of 3 and 5 -
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6, and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

#include <stdio.h>

// Function prototype
int multiples(int, int, int);

/* Main Function */
int main() {
  // Problem Constants
  const int FACTOR_ONE = 3;
  const int FACTOR_TWO = 5;
  const int MAX_COUNT = 1000;
  
  // Primary function call
  int answer = multiples(FACTOR_ONE, FACTOR_TWO, MAX_COUNT);
  
  // Display results
  printf("%d", answer);
  
  return 0;
}

/* Find sum of multiples less than maxCount */
int multiples(int factor1, int factor2, int maxCount) {
  // Variables
  int sum = 0;

  // Loop through every number less than MAX_COUNT
  int count;
  for (count = 1; count < maxCount; count++) {
    // If current number is a multiple of either FACTOR, add to sum
    if (((count % factor1) == 0) || ((count % factor2) == 0)) {
      sum += count;
    }
  }

  // Return sum
  return sum;
}