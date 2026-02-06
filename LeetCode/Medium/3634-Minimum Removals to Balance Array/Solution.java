class Solution {
    public int minRemoval(int[] nums, int k) {
     Arrays.sort(nums);
        int n = nums.length;
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
           
            while (nums[right] > (long)nums[left] * k) {
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return n - maxLength;
    }
}