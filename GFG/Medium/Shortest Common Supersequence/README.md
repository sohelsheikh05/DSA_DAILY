## Problem Link : [Shortest Common Supersequence](https://www.geeksforgeeks.org/problems/shortest-common-supersequence0322/1)

## Intution
  1. Max length of final string is s1.length()+s2.length .
  2. Out Of these the length that can be removed is those characters that are repeating which means if we have the length of common subsequence we can conclude
  Length of Super sequence = s1.length() + s2.length() - common length

## Solution
   1. Uses LCS to find longest common Subsequence .
      refer to : [LCS](https://github.com/sohelsheikh05/DSA_DAILY/tree/main/LeetCode/Medium/1143-Longest%20Common%20Subsequence) .
   2. Length of Super sequence = s1.length() + s2.length() - common length