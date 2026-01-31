class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int left=0,right=n-1,ans=n;
        while(left<=right){
          int mid=left+(right-left)/2;
          if(letters[mid]>target){ right=mid-1; ans=mid;}
          else left=mid+1;
        }
    return letters[ans%n];
    }
}