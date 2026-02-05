class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int t=Math.abs(nums[i])%n;
            
            if(nums[i]<0)
            res[i]=nums[(n+i-t)%n];
            else
             res[i]=nums[(i+t)%n];
        }
    return res;
    }
}