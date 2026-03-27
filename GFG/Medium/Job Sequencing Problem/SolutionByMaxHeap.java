class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=deadline.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int res[][]=new int[n][2];
        for(int i=0;i<deadline.length;i++){
            res[i][0]=deadline[i];
            res[i][1]=profit[i];
           
        }
        Arrays.sort(res,(a,b)->{
            return a[0]-b[0];
        });
        int p=0,c=0,j=n-1;
        for(int i=res[n-1][0];i>0;i--){
            while(j>=0 && res[j][0]>=i){
                pq.offer(res[j][1]);
                j--;
            }
            if(!pq.isEmpty()){
                p+=pq.poll();
                c++;
            }
        }
        ArrayList<Integer> l=new ArrayList<>();
        l.add(c);
        l.add(p);
    return l;
    }
}