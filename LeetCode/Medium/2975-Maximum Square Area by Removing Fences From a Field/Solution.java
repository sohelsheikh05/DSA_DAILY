class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        int h[]=Arrays.copyOf(hFences,hFences.length+2);
        h[hFences.length]=1;
        h[hFences.length+1]=m;
        Arrays.sort(h);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<h.length;i++){
            for(int j=i+1;j<h.length;j++){
                set.add(h[j]-h[i]);
            }
        }
        int max=-1;
        int v[]=Arrays.copyOf(vFences,vFences.length+2);
        v[vFences.length]=1;
        v[vFences.length+1]=n;
        Arrays.sort(v);
        // System.out.println(Arrays.toString(v));
        for(int i=0;i<v.length;i++){
            for(int j=i+1;j<v.length;j++){
                int ans=v[j]-v[i];
                if(set.contains(ans)){
                //    System.out.println(i+" "+j); 
                  max=Math.max(max,ans);
                  }
            }
        }
        if(max==-1) return -1;
     long MOD = 1_000_000_007L;
    return (int)((1L * max * max) % MOD);   
    }
}