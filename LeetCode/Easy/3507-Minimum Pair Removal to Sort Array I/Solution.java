class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums) list.add(num);
        int op=0;
        while(!isSorted(list)){
            int pair=getPair(list);
            merge(pair,list);
            op++;
        }
     return op;
    }
    boolean isSorted(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1))
             return false;
        }
    return true;
    }
    int getPair(ArrayList<Integer> list){
        int minsum=(int)1e9;
        int pos=-1;
        for(int i=0;i<list.size()-1;i++){
            
            int sum=list.get(i)+list.get(i+1);
            if(sum<minsum){
                minsum=sum;
                pos=i;
            }
        }
    return pos;
    }
    void merge(int pos,ArrayList<Integer> list){
      list.set(pos,list.get(pos)+list.get(pos+1));
      list.remove(pos+1);
    }
}