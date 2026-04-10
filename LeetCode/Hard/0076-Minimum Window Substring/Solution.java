class Solution {
    public String minWindow(String s, String t) {
       HashMap<Character,Integer> map=new HashMap<>();
       int countrequired=0;
        for(char ch : t.toCharArray()){
            countrequired++;
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0;
        int start=0,end=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           
            if(map.containsKey(ch) && map.get(ch)>0) countrequired--;
             map.put(ch,map.getOrDefault(ch,0)-1);
         
            
             
            while(countrequired == 0){
                
                int currdiff = i - left + 1;
                if(currdiff < min){
                    min = currdiff;
                    start = left;
                    end = i;
                }

                char ch1 = s.charAt(left);
                map.put(ch1, map.getOrDefault(ch1, 0) + 1);

                if(map.get(ch1) > 0){
                    countrequired++;
                }

                left++;
              }
             
            
        }
       if(min == Integer.MAX_VALUE) return "";
        // System.out.println(left);
    return s.substring(start,end+1);
    }
}