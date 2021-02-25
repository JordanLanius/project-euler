"""
 # Project Euler
 # Problem 5 - Python
 # 
 # Jordan Lanius
 # jordan.lanius@gmail.com
 #
 # - Smallest Multiple -
 # 2520 is the smallest number that can be divided by each of the numbers from 1
 # to 10 without any remainder.
 #
 # What is the smallest positive number that is evenly divisible by all of the
 # numbers from 1 to 20?
"""

## Find the greatest common denominator of two numbers ##
def gcd(num1, num2):
  # Recursively call gcd if num2 is not a factor of num1
  if (num1 % num2) != 0:
    return gcd(num2, num1 % num2)
  else:
    return num2

## Find the least common multiple of the first n numbers ##
def lcm(topNum):
  leastMult = 1
  # Multiply all numbers in range, dividing by gcd each time
  for count in range(1, topNum + 1):
    leastMult = int((leastMult * count) / gcd(leastMult, count))
  # Return least common multiple
  return leastMult

## Main Function ##
# Problem Constants
TOP_NUM = 20

# Primary function call
answer = lcm(TOP_NUM)

# Display answer
print (answer)