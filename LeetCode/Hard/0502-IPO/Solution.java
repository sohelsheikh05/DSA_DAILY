class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=profits.length;
        int pref[][]=new int[n][2];
        for(int i=0;i<n;i++ ){
             pref[i][0]=capital[i];
             pref[i][1]=profits[i];
        }
        Arrays.sort(pref,(a,b)->a[0]-b[0]);
        // System.out.println(Arrays.deepToString(pq.toArray()));
        int i=0;
        while(k>0 ){
            while(i<n && pref[i][0]<=w){
                pq.offer(pref[i][1]);
                i++;
            }
            if(pq.isEmpty()) break;
            w+=pq.poll();

            
            //  System.out.println(Arrays.deepToString(pq.toArray()));
            k--;

        }
     return w;
    }
}