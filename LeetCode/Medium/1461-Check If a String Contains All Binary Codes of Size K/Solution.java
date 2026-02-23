class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i+k<=n;i++){
            set.add(s.substring(i,i+k));
        }
        int x=(int)Math.pow(2,k);
        System.out.println(x);
    return x==set.size();
    }
}