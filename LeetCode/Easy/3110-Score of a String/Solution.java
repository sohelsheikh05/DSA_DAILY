class Solution {
    public int scoreOfString(String s) {
        
        char a[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<a.length-1;i++){
            int a1=(int)a[i];
            int b=(int)a[i+1];
            sum=sum+Math.abs(b-a1);
        }
        return sum;
    }
}