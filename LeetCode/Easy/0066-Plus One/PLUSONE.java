class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list=new ArrayList<>();
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9 ){
                if(carry==1){
                list.add(0,0);
                carry=1;
                }
                else
                 list.add(0,9);
            }
            else{
               list.add(0,digits[i]+carry);
               carry=0;
            }
        }
        if(carry==1) list.add(0,1);
        while(list.size()>0 && list.get(0)==0)
          list.remove(0);
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
         ans[i]=list.get(i);
        return ans;
    }
}