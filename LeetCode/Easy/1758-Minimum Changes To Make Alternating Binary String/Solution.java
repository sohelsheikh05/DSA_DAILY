class Solution {
    public int minOperations(String s) {
        int n=s.length();
    int c1=0,c2=0,first=1,second=0;
    for(int i=0;i<n;i++){
        if(s.charAt(i)-'0'!=first) c1++;
        if(s.charAt(i)-'0'!=second) c2++;
        first=1-first;
        second=1-second;
    }
    return Math.min(c1,c2);
    }
}