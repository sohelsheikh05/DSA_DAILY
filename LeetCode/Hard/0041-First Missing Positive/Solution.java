class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
      boolean hasone=false;
      for(int i=0;i<n;i++){
           if(nums[i]==1) hasone=true;
           if(nums[i]>n || nums[i]<=0) nums[i]=1;
      }
      if(!hasone) return 1;
      for(int i=0;i<n;i++){
        int curr=Math.abs(nums[i]);
        nums[curr-1]=(nums[curr-1]<0)?nums[curr-1]:-nums[curr-1];
      }
      for(int i=0;i<n;i++){
        if(nums[i]>0) return i+1;
      }
    return n+1;
    }
}