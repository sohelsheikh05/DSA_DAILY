class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,n=nums.length;
        for(int num:nums) sum+=num;
        int leftsum=0;
        for(int i=0;i<n;i++){
           
            int rightsum=sum-leftsum-nums[i];
            if(leftsum==rightsum) return i;
             leftsum+=nums[i];
        }
    return -1;
    }
}