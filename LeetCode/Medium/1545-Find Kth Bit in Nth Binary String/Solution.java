class Solution {
    public char findKthBit(int n, int k) {
        String last="0";
       
        for(int i=2;i<=n;i++){
            // System.out.println(last);
            String curr=reverse(invert(last));
            last=last+"1"+curr;
        }
    //   System.out.println(last);
    return last.toCharArray()[k-1];
    }
    String invert(String s){
        //  System.out.println("invert : "+s);
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='0') sb.setCharAt(i,'1');
            else sb.setCharAt(i,'0');
        }
        // System.out.println("invert : "+sb.toString());
    return sb.toString();
    }
    String reverse(String s){
        StringBuilder sb=new StringBuilder(s);

    // System.out.println("reverse : "+sb.reverse().toString());
    return sb.reverse().toString();
    }
}