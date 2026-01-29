class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[]=new int[nums.length];
        int mul=1;
        int dealz=0;
        for(int num :nums){
            if(num!=0)
            mul*=num;
            if(num==0)
             dealz++;
        }
        if(dealz>0){
           if(dealz>1){
            Arrays.fill(result,0);
            return result;
           }
           for(int i=0;i<nums.length;i++){
              if(nums[i]==0)
               result[i]=mul;
            else
               result[i]=0;
           }
           return result;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
             result[i]=mul/nums[i];
            else
             result[i]=mul;
        }
        return result;
    }
}