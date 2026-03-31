class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int farthest=0,end=0,jumps=0;
        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest,nums[i]+i);
            if(i==end){
                jumps++;
                end=farthest;
            }
        }
        
        return jumps;
    }
   
}