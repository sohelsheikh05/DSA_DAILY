public class Solution {
    public int repeatedNTimes(int[] a) {
        int n=a.length;
        for(int i=0;i<n-2;i++){
            if(a[i]==a[i+1] || a[i+2]==a[i]) return a[i];
        }
    return a[n-1];
    }
}
