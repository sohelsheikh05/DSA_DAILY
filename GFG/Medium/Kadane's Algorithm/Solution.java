class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int num:arr){
            
            curr+=num;
             max=Math.max(max,curr);
            if(curr<0){
                curr=0;
            }
        }
        if(curr>0) max=Math.max(max,curr);
        return max;
    }
}
