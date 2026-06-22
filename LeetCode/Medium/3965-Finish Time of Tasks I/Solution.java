class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int edge[]:edges){
            map.computeIfAbsent(edge[0],k-> new ArrayList<>()).add(edge[1]);
        }
        return dfs(map,0,baseTime,n);
    }
    long dfs(HashMap<Integer,ArrayList<Integer>> map,int curr,int[] baseTime,int n){
        if(!map.containsKey(curr)) return baseTime[curr];
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int edge:map.get(curr)){
            long dur=dfs(map,edge,baseTime,n);
            min=Math.min(min,dur);
            max=Math.max(max,dur);
        }
        long own=(max-min)+baseTime[curr];
        return own+max;
    }
}