class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int l = 0, r = 0;
        int z = 0, max = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1)
                c++;

        }
        if (c == n) {
            return n - 1;
        }
        while (r < n) {
            if (nums[r] == 0) {
                z++;
            }
            while (z > 1) {
                if (nums[l] == 0)
                    z--;
                l++;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max-1;

    }
}