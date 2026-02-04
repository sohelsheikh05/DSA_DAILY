// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        res.add(1);
        int res_size=1;
        for(int i=2;i<=n;i++){
            res_size=multiply(i,res,res_size);
        }
        Collections.reverse(res);
        return res;
    }
    static int multiply(int curr,ArrayList<Integer> res,int res_size){
        int carry=0;
        for(int i=0;i<res_size;i++){
            int temp=res.get(i)*curr+carry;
            
            res.set(i,temp%10);
           
            carry=temp/10;
        }
        while(carry>0){
            
            res.add(res_size,carry%10);
            res_size++;
            carry=carry/10;
        }
     
    return res_size;
    }
}