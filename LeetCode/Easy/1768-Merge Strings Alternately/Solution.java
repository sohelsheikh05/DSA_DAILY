class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int n=word1.length();
        int m=word2.length();
        int j=0,k=0,i=0;
        while(j<n && k<m){
            if((i & 1)==0){
                sb.append(word1.charAt(j));
                j++;
            }
            else{
                sb.append(word2.charAt(k));
                k++;
            }
            i++;
        }
        while(j<n) {sb.append(word1.charAt(j));j++;}
        while(k<m) {sb.append(word2.charAt(k));k++;}
        return sb.toString();
    }
}