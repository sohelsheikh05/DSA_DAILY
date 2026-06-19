class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        m = m - 1;
        n = n - 1;
        if (nums1.length == 0 || nums2.length == 0) {
            return;
        }

        while (m >= 0 && n >= 0) {
            if (nums2[n] > nums1[m]) {
                nums1[i] = nums2[n];
                n--;
            } else {
                nums1[i] = nums1[m];
                m--;
            }
            i--;
        }
        while (m < 0&&n>=0) {

            nums1[i] = nums2[n];
            n--;

            i--;

        }
        while (n < 0&&m>=0) {
            nums1[i] = nums1[m];
            m--;
            i--;
        }
    }
}