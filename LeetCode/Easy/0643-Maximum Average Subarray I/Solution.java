class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums==null || nums.length<k || k<=0 ) return 0.0;
        double avg=0.0;
        double sum=0.0;
        for(int i=0;i<k;i++)
           sum+=nums[i];
        avg=sum/k;
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            avg=Math.max(avg,sum/k);
        }
    return avg;
    }
}