class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        if(n==1) return -1;
        long sum[]=new long[n];
        long prod[]=new long[n];
        sum[0]=0;
        prod[n-1]=1;
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+nums[i-1];

        }
        for(int j=n-2;j>=0;j--){
            
            prod[j]=prod[j+1]>Long.MAX_VALUE/nums[j+1]?Long.MAX_VALUE:prod[j+1]*nums[j+1];
        }
        // System.out.println(Arrays.toString(sum));
        //  System.out.println(Arrays.toString(prod));
        for(int i=0;i<n;i++){
            if(sum[i]==prod[i]) return i;
        }
        
    return -1;
    }
}