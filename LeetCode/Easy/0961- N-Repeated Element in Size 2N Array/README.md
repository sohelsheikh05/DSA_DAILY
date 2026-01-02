## PigeonHole Principle
  If a number is repeated n times in an 2*n size Array then there is a pattern for       presence of the repeated number.

## Pattern 
  In these question the pattern is that if a number is repeated then it is sure that the number will appear twice in the window of size 3.
  If these condition is false then the repeating element is sure to be prec=sent ar last index .

## Conditions
    if nums[i]==nums[i+1] or nums[i]==nums[i+2] return nums[i]
    else return nums[nums.length-1]

## Example 
    
  ### 1. nums=[1,2,3,3]
        i=0 t0 i<n-2
        for i=0 
            1!=2 0r 1!=3 
        for i=1
            2!=3 or 2!=3
        loop end
        return 3 //nums[n-1]

## Complexity :
     Time : O(N)
     Space : O(1)
        
          