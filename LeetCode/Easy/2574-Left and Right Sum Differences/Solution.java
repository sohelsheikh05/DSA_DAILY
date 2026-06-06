class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans= new int[nums.length];

        int totalSum=0;
        for(int i : nums)
        {
            totalSum+=i;
        }

        int leftSum=0; 
        
        for(int j=0;j<nums.length;j++)
        {
            int rightSum=totalSum-leftSum-nums[j];
            ans[j]=Math.abs(leftSum-rightSum);
            leftSum+=nums[j];
        }
        return ans;
    }
}