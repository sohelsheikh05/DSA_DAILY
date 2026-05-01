class Solution {
    public int maxRotateFunction(int[] nums) {
       int n=nums.length;
       if(n==1) return 0;
       if(n==2) return Math.max(nums[0],nums[1]);
       int res=0,sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
        res+=i*nums[i];
       }
       int max=res;
       for(int i=1;i<n;i++){
        res+=sum-n*nums[n-i];
        max=Math.max(max,res);
       }
    return max;
    }
}