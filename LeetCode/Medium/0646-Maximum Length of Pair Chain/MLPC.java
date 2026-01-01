class Solution {
    public int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs,Comparator.comparingInt(a -> a[1]));
       int count=1;
       int last[]=pairs[0];
       int max=1;
       for(int i=1;i<pairs.length;i++){
            int cur[]=pairs[i];
            if(cur[0]>last[1]){
                count++;
                last=cur;
            }
       }
      
     return count;
    }
}