class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        if(n==1) return 0;
        long min=Long.MAX_VALUE;
        long max=-1;
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
    return (max-min)*k;
    }
}