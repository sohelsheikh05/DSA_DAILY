## Problem Link : [Link](https://leetcode.com/problems/four-divisors/)

## Intuition :
   1. At first it seems a simple problem to solve just find the divisors of each number.
   2. If it has exactly 4 divisors including 1 and itself then add sum of divisors to total sum .
   3. But to do so i.e find number of divisors we need to loop through m .
   4. can it be reduced down to square root of m .
   5. Yes , But How ?
      1. for each divisor i of m we can say there is another divisor of m that can be found out using i that is m/i.
      for Example : n= 16 then as 2 is divisor of 16 m/i i.e 16/2= 8 is also a divisor of 16
      2. Due to these now we have with us the solution  to run loop till only square root of m instead of m .
      3. The base condition here is only when m is perfect square and i ==sqrt(m) because 4*4 is 16 that don't need to count double .
   6. By these the inner loop is reduced to sqrt(m) instead of m .

## Complexity :
  1. Time  : O(n*sqrt(m)) n=size of array  m=element in array
  2. Space : O(1)