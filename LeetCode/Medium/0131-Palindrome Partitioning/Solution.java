class Solution {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        res=new ArrayList<>();
         BackTrack(0,new ArrayList<>(),s);
        return res;
    }
    void BackTrack(int curr,ArrayList<String> path,String s){
        if(curr==s.length()){
          res.add(new ArrayList<>(path));
          return ;
          }
        for(int i=curr+1;i<=s.length();i++){
            String temp=s.substring(curr,i);
           if(isPalindrome(temp)){
            path.add(temp);
            BackTrack(i,path,s);
            path.remove(path.size()-1);
           }
        }
    }
    boolean isPalindrome(String s){
        
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}