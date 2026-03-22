class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0,sum=0,ind=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
             
            sum+=diff;
            curr+=diff;
            if(curr<0) {curr=0;ind=i+1;}
        }
    if(sum>=0) return ind;
    return -1;
    }
}