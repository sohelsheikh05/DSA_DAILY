class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long prefix[]=new long[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
                   
        }
        long max=Long.MIN_VALUE;
        map.put(nums[0],0);
        for(int i=1;i<n;i++){
             int tar1=nums[i]-k;
             int tar2=nums[i]+k;
             if(map.containsKey(tar1)){
                int ind=map.get(tar1);
                max=Math.max(max,prefix[i]-prefix[ind]+nums[ind]);
                
             }
             if(map.containsKey(tar2)){
                int ind=map.get(tar2);
                max=Math.max(max,prefix[i]-prefix[ind]+nums[ind]);
             }
            if(map.containsKey(nums[i])){
                int x=map.get(nums[i]);
                if((prefix[x]-nums[x])>(prefix[i]-nums[i])) map.put(nums[i],i);
            }
            else{
                map.put(nums[i],i);
            }
        }
    return max==Long.MIN_VALUE?0:max;
    }
}