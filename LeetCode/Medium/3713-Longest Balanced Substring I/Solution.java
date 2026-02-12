class Solution {
    public int longestBalanced(String s) {
        int len=0;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int unq=0,maxf=0;
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(!map.containsKey(ch)) unq++;
                map.put(ch,map.getOrDefault(ch,0)+1);
                maxf=Math.max(maxf,map.get(ch));
                int size=j-i+1;
                if((unq*maxf)==size) len=Math.max(len,size);
            }
            map.clear();
        }
    return len;
    }
}