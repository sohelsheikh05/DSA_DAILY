class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                    count++;
             }
            if(i-k+1>=0){
                max=Math.max(count,max);
                if(isVowel(s.charAt(i-k+1))){
                    count--;
                }
            }
            
        }
        return max;
    }
    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e'  || ch=='i' || ch=='o'  || ch=='u')
            return true ;
        return false;
    }
}