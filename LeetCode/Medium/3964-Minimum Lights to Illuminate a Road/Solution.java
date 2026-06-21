class Solution {
    public int minLights(int[] lights) {
        int light=0;
        int n=lights.length;
        for(int i=0;i<n;i++){
            if(lights[i]!=0){ 
                if(lights[i]>=light)
                light=Math.max(light,lights[i]);
                else light--;
                }
            else {
                if(light>0) lights[i]=1;
                if(light>0) light--;
            }
            
         }
         light=0;
         for(int i=n-1;i>=0;i--){
            if(lights[i]!=0){ 
                // if(lights[i]>light)
                light=Math.max(light,lights[i]);
                // else light--;
                }
            else {
                if(light>0) lights[i]=1;
                if(light>0) light--;
            }
            
         }
         System.out.println(Arrays.toString(lights));
         int count=0;
         for(int i=0;i<n;i++){
            if(lights[i]==0){
                // if(i>0 && lights[i-1]>0) continue;
                count++;
                if(i<n-1) lights[i+1]=1;
                if(i<n-2)lights[i+2]=1;
            }
         }
    return count;
    }
}