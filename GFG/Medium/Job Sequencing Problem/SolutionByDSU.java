class Solution {
    static int parent[];
    static int find(int x){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x]);
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
         // code here
        int n=deadline.length;
        int res[][]=new int[n][2];
        int max=-1;
        for(int i=0;i<deadline.length;i++){
            max=Math.max(max,deadline[i]);
            res[i][0]=deadline[i];
            res[i][1]=profit[i];
           
        }
        Arrays.sort(res,(a,b)->{
            return b[1]-a[1];
        });
         parent=new int[max+1];
         for(int i=0;i<=max;i++) parent[i]=i;
        int p=0,c=0,j=n-1;
        for(int curr[]:res){
            
            int slot=find(curr[0]);
            if(slot>0){
                p+=curr[1];
                c++;
                parent[slot]=find(slot-1);
            }
        }
        
        ArrayList<Integer> l=new ArrayList<>();
        l.add(c);
        l.add(p);
    return l;
    }
}