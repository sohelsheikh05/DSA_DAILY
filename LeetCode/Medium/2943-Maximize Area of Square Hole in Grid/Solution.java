class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int hx=hBars[0];
        int hy=hBars[0];
        int prevhx=hBars[0];
        int i=0;
        int maxc=1,count=1;
        while(i<hBars.length-1){
            if(hBars[i]+1!=hBars[i+1]){
                 if(count>maxc){
                    hy=hBars[i];
                    hx=prevhx;
                    maxc=count;
                    
                 }
                 prevhx=hBars[i+1];
                 count=1;
            }
            else count++;
            i++;
        }
        if(count>maxc){
            hy=hBars[i];
            hx=prevhx;
                    
         }
        int vx=vBars[0];
         int vy=vBars[0];
        int prevvx=vBars[0];
        int j=0;
         maxc=1;count=1;
        while(j<vBars.length-1){
            if(vBars[j]+1!=vBars[j+1]){
                 if(count>maxc){
                    vy=vBars[j];
                    vx=prevvx;
                    maxc=count;
                    
                 }
                 prevvx=vBars[j+1];
                 count=1;
            }
            else count++;
        j++;
        
        }
        if(count>maxc){
            vy=vBars[j];
            vx=prevvx;
                    
        }
        int ans=Math.min(hy-hx+2,vy-vx+2);
        return ans*ans;
    }
}