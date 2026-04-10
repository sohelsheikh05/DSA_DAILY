class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int cursize=map.containsKey(nums[i])?map.get(nums[i]).size():0;
            if(cursize<3)
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
            else{
                map.get(nums[i]).remove(0);
                map.get(nums[i]).add(i);  
            }
            if(map.get(nums[i]).size()==3){
                ArrayList<Integer> temp=map.get(nums[i]);
                int i1=temp.get(0),j=temp.get(1),k=temp.get(2);
                int prevdiff=2 * (Math.max(i1, Math.max(j, k)) - Math.min(i1, Math.min(j, k)));
                min=Math.min(min,prevdiff);
            }
        } 
   
    return min==Integer.MAX_VALUE?-1:min;
    }
}