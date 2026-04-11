class Solution {
    public int candy(int[] ratings) {
        int candies[]=new int[ratings.length];
        int cnt=0;
        for(int i=0;i<candies.length;i++)candies[i]=1;
        for(int i=1;i<candies.length;i++){
            if(ratings[i]>ratings[i-1])
              candies[i]=candies[i-1]+1;
        }
        for(int i=ratings.length-1;i>0;i--){
            if(ratings[i-1]>ratings[i])
             candies[i-1]=Math.max(candies[i-1],candies[i]+1);
             cnt+=candies[i-1];
        }
      return cnt+=candies[candies.length-1];
    }
}