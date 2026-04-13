class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      Deque<Integer> q=new ArrayDeque<>();
        int result[]=new int[nums.length-k+1];
        int left=0;
        for(int i=0;i<nums.length;i++){
           if (!q.isEmpty() && q.peekFirst() == i - k)
                 q.pollFirst();
           while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
            q.pollLast();
            q.offerLast(i);
           if(i>=k-1){
             result[left++]=nums[q.peekFirst()];
           }
        }
        return result;
    }
}