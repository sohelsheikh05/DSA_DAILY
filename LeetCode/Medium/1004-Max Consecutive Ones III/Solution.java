class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,max=0;
        while(right<nums.length){
           if(nums[right]==0 ){
                if(k>0){
                    k--;
                   
                }
                else{
                   
                    while(nums[left]!=0){
                        left++;
                    }
                    left++;
                   
                }
           }

            max=Math.max(right-left+1,max);
            right++;
        }
        
        return max;
    }
}