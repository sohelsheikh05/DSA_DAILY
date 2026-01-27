class Solution {
    public int minCost(int n, int[][] edges) {
        HashMap<Integer,ArrayList<int[]>> map=new HashMap<>();
        for(int t[]:edges){
            map.computeIfAbsent(t[0],k->new ArrayList<>()).add(new int[]{t[1],t[2]});
            map.computeIfAbsent(t[1],k->new ArrayList<>()).add(new int[]{t[0],2*t[2]});
        }
        int res[]=new int[n];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[0]=0;
        PriorityQueue<int[]> queue=new PriorityQueue<>((a,b)->a[1]-b[1]);
        queue.offer(new int[]{0,0});
        while(!queue.isEmpty()){
            int curr[]=queue.poll();
            int node=curr[0];
            int cost=curr[1];
            for(int next[]:map.getOrDefault(node,new ArrayList<>())){
                if(cost+next[1]<res[next[0]]){
                    res[next[0]]=cost+next[1];
                    queue.offer(new int[]{next[0],res[next[0]]});
                }
            }
        }

    return res[n-1]==Integer.MAX_VALUE?-1:res[n-1];
    }
}