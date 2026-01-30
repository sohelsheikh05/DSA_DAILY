class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        int count=0;
        while(left<right){
            if(nums[left]+nums[right]==k){
                count++;
                left++;
                right--;
            }
            else if(nums[left]+nums[right]<k){
                 left++;
            }
            else right--;
        }
    return count;
    }
}

// class Solution {
//     public int maxOperations(int[] nums, int k) {
//         HashMap<Integer,Integer> list=new HashMap<>();
//         for(int num:nums){list.put(num,list.getOrDefault(num,0)+1);}
//         int count=0;
//         for(int num:nums){
//             if(!list.containsKey(num)) continue;
//             int need=k-num;
//             if(need==num){
//                 if(list.get(num)>=2){ 
//                     list.put(num,list.get(num)-2);
//                     count++;
//                     if(list.get(num)==0) list.remove(num);
//                 }
//             }
//             else{
//                 if(list.containsKey(need) ){
//                     count++;
//                      list.put(need,list.get(need)-1);
//                      list.put(num,list.get(num)-1);
//                      if(list.get(num)==0) list.remove(num);
//                      if(list.get(need)==0) list.remove(need);
//                 }
//             }
//         }
//     return count;
//     }
// }