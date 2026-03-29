class Solution {
    public boolean checkStrings(String s1, String s2) {
        StringBuilder sb1E=new StringBuilder();
        StringBuilder sb2E=new StringBuilder();
        StringBuilder sb1O=new StringBuilder();
        StringBuilder sb2O=new StringBuilder();
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
               sb1E.append(s1.charAt(i));
               sb2E.append(s2.charAt(i));
            }
            else{
               sb1O.append(s1.charAt(i));
               sb2O.append(s2.charAt(i));
            }
        }
       char s11[]=sb1E.toString().toCharArray();Arrays.sort(s11);
       char s22[]=sb1O.toString().toCharArray();Arrays.sort(s22);
       char s3[]=sb2E.toString().toCharArray();Arrays.sort(s3);
       char s4[]=sb2O.toString().toCharArray();Arrays.sort(s4);
       return Arrays.equals(s11,s3) &&  Arrays.equals(s22,s4) ;
    }
}