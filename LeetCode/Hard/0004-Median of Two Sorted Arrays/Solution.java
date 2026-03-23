class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
           return findMedianSortedArrays(nums2,nums1);
        
        int left=0,right=nums1.length;
        int m=nums1.length,n=nums2.length;
        while(left<=right){
            int px=(right+left)/2;
            int py=(m+n+1)/2-px;
            int max1=(px==0)?Integer.MIN_VALUE:nums1[px-1];
            int max2=(py==0)?Integer.MIN_VALUE:nums2[py-1];
            int min1=(px==m)?Integer.MAX_VALUE:nums1[px];
            int min2=(py==n)?Integer.MAX_VALUE:nums2[py];
            if(max1<=min2 && max2<=min1){
                if((m+n)%2==1) return (double) Math.max(max1,max2);
                return (Math.max(max1,max2)+Math.min(min1,min2))/2.0;
            }
            else if(max1>min2){
                 right=px-1;
            }
            else
              left=px+1;
        }
    return 0.0;
    }
}