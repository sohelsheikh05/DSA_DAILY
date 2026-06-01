class Solution {
    public int minimumCost(int[] cost) {
        int min=0;
        int n=cost.length;
        if(n==1) return cost[0];
        if(n==2) return cost[0]+cost[1];
        Arrays.sort(cost);
        int i;
        for(i=n-1;i>=1;i-=3){
            min+=cost[i]+cost[i-1];
        }
        if(i==0) min+=cost[0];
    return min;
    }
}