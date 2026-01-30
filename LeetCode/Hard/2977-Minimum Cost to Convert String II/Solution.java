class Solution {
    public long minimumCost(String source, String target, String[] original, String[] changed, int[] cost) {
         HashMap<String,Integer> map=new HashMap<>();
         HashSet<Integer> set=new HashSet<>();
         int size=0;
         int m=original.length;
         long dp[][]=new long[201][201];
         for(int i=0;i<201;i++){
            Arrays.fill(dp[i],Long.MAX_VALUE);
         }
         
         for(int i=0;i<m;i++){
            if(!map.containsKey(original[i])){
                map.put(original[i],size++);
                set.add(original[i].length());
            }
            if(!map.containsKey(changed[i])){
                 map.put(changed[i],size++);
            }
            int u=map.get(original[i]);
            int v=map.get(changed[i]);
            dp[u][v]=Math.min(dp[u][v],cost[i]);
         }
        
         for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                    if(dp[j][i]!=Long.MAX_VALUE && dp[i][k]!=Long.MAX_VALUE ){
                        dp[j][k]=Math.min(dp[j][k],dp[j][i]+dp[i][k]);
                    }
                }
            }
         }
         int n=source.length();
       long res[]=new long[n+1];
       Arrays.fill(res,Long.MAX_VALUE);
       res[0]=0;
       for(int i=0;i<n;i++){
            if(res[i]==Long.MAX_VALUE) continue;
            if(source.charAt(i)==target.charAt(i)){
                res[i+1]=Math.min(res[i+1],res[i]);
            }
            for(int l:set){
                if(i+l>n) continue;
                String src=source.substring(i,i+l);
                String tar=target.substring(i,i+l);
                
                if(map.containsKey(src) && map.containsKey(tar)){
                    int u=map.get(src),v=map.get(tar);
                    if(dp[u][v]!=Long.MAX_VALUE){
                        res[i+l]=Math.min(res[i+l],res[i]+dp[u][v]);
                    }
                }

            }
       }
    return res[n]==Long.MAX_VALUE?-1:res[n];
    }
}