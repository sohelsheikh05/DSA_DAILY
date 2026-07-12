class Solution {
    int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size(),n=grid.get(0).size();
        boolean visited[][]=new boolean[m][n];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        if(grid.get(0).get(0)==1)
          pq.offer(new int[]{0,health-1});
        else
          pq.offer(new int[]{0,health});
        visited[0][0]=true;
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int row=curr[0]/n;
            int col=curr[0]%n;
            if(row==m-1 && col==n-1) return true;
            for(int d[]:dir){
                int newr=row+d[0];
                int newc=col+d[1];
                if(newr<0 || newr>=m || newc<0 || newc>=n) continue; 
                int newh=grid.get(newr).get(newc)==1?curr[1]-1:curr[1];
                if(newh<=0)continue;

                
                if(!visited[newr][newc]){
                    visited[newr][newc]=true;
                    pq.offer(new int[]{newr*n+newc,newh});
                }
            }
        } 
    return false;
    }
}