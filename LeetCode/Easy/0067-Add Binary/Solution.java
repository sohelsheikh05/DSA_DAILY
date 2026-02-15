class Solution {
    public String addBinary(String a, String b) {
        int al=a.length()-1,bl=b.length()-1;
        int n=Math.max(al,bl)+2;
        StringBuilder sb=new StringBuilder();
        int carry=0;
        int curr=n-1;
        while(al>=0 || bl>=0){
            int sum=carry;
            sum+=al>=0?a.charAt(al)-'0':0;
            sum+=bl>=0?b.charAt(bl)-'0':0;
            sb.insert(0,sum%2);
            carry=sum/2;
            curr--;
            al--;
            bl--;
        }
        if(carry==1)  sb.insert(0,carry);;
        return sb.toString();
    }
}