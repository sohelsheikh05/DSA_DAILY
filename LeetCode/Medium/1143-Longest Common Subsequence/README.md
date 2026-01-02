## LeetCode Link : [https://leetcode.com/problems/longest-common-subsequence/](https://leetcode.com/problems/longest-common-subsequence/)

## Why DP
   1.Every Time we have choice of which character to keep for continue checking for same subsequence either from text1 or from text2.  

   2.There are same subproblems that are to be solved .

## Tree Diagram for Recursion
  ![alt text](<Tree DiaGram.jpeg>)

## Bottom Up State Definition
  1.Suppose i got the same character at index i and j representing index for text1 and text2 respectively i would say what was the count when last time two characters were same these element will add one to it . The last time these happens will be at top left of current so we add 1 to it . 

  2.If the characters arent same then we are with the option to leave behind one of the character out of character pointed by i and j .If character pointed by i is choosen then value will be decide by j-1 else will be decided by i-1 .We wil take max out of it.
###
      if(text1.charAt(i-1)==text2.charAt(j-1))
        dp[i][j]=dp[i-1][j-1]+1;
      else
        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
    
## Complexity
  Time : O(m+n)  
  
  Space : O(m*n)

