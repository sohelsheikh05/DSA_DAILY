class Solution {
    public int longestBalanced(int[] nums) {
        int max=0,n=nums.length;
        HashSet<Integer> oddset=new HashSet<>();
        HashSet<Integer> evenset=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)evenset.add(nums[i]);
            else oddset.add(nums[i]);
            for(int j=i+1;j<n;j++){
                if(nums[j]%2==0)evenset.add(nums[j]);
                else oddset.add(nums[j]);
                if(oddset.size()==evenset.size()) max=Math.max(max,j-i+1);
            }
            // System.out.println(oddset+" "+evenset);
            oddset.clear();
            evenset.clear();
        }
    return max;
    }
}