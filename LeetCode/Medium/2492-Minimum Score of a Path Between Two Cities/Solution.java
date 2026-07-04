class Solution {
    public int minScore(int n, int[][] roads) {
        HashMap<Integer,ArrayList<int[]>> map=new HashMap<>();
        int[] visited=new int[n+1];
        for(int road[]:roads){
            map.computeIfAbsent(road[0],k->new ArrayList<>()).add(new int[]{road[1],road[2]});
            map.computeIfAbsent(road[1],k->new ArrayList<>()).add(new int[]{road[0],road[2]});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{1,0,Integer.MAX_VALUE});
        Arrays.fill(visited,Integer.MAX_VALUE);
        int min=Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            //System.out.println(curr[0]);
            if(curr[0]==n){
                min=Math.min(min,curr[2]);
                //continue;
            }
             //System.out.println(map.get(curr[0]));
            for(int next[]:map.getOrDefault(curr[0],new ArrayList<>())){
                int min1=Math.min(curr[2],next[1]);
                
                if( visited[next[0]]>min1){
                pq.offer(new int[]{next[0],next[1]+curr[1],min1});
                visited[next[0]]=min1;
                 //System.out.println(next[0]+" "+next[1]+" "+min1);
                }
            }

        }
        return min;
    }
}