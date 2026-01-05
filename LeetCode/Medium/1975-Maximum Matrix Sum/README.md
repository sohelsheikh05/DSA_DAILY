## Problem Link : [Link](https://leetcode.com/problems/maximum-matrix-sum)

## Intuition :
  1. Given that we can pick two numbers that share boundary with  -1 .
  2. To make the sum maximum need to convert all negatives to positive .
  3. for that we need to behind all negatives together sharing boundary .
  4. As we can select any two and multiply them by -1 tp make them positive  it is possible to make pairs of these negatives to convert them to positive .
  5. If there are even number of negative numbers them all of them can be made positive making sum equals sum of array .
  6. If total negative element is odd them one remains and that ned to be subtracted from the total array sum .
  7. Not which element to subtract the element that makes less impact that is min from the matrix .
  8. why subtract 2 times of min ? the reason is while calculating sum the element was added so these need to be removed from sum .Additionally the negative number reduces sum as sum is of matrix .

## Complexity :
  1. Time : O(n2) to traverse matrix .
  2. Space : O(1)  