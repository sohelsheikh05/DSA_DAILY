/* The functions which
builds the segment tree */
class Solution {
    static int segmentTree[];
    static int Gright;
    public static int[] constructST(int nums[], int n) {
        // Add your code here
        segmentTree=new int[4*nums.length];
        Gright=nums.length-1;
        BuildTree(0,0,nums.length-1,nums);
      return segmentTree;
    }

    /* The functions returns the
      min element in the range
      from l and r */
    public static int RMQ(int st[], int n, int l, int r) {
        // Add your code here
        return RangeQuery(0,0,Gright,l,r);
    }
    static void BuildTree(int curr,int left,int right,int nums[]){
        if(left==right){
            segmentTree[curr]=nums[left];
            return ;
        }
        int mid=(left+right)/2;
        BuildTree(2*curr+1,left,mid,nums);
        BuildTree(2*curr+2,mid+1,right,nums);
        segmentTree[curr]=Math.min(segmentTree[2*curr+1],segmentTree[2*curr+2]);
    }
    static int RangeQuery(int curr,int left,int right,int leftq,int rightq){
        if(leftq>right || rightq<left){
            
            return Integer.MAX_VALUE;
        }
        if (leftq <= left && rightq >= right) {
            return segmentTree[curr];
        }

        int mid=(left+right)/2;
    
        return Math.min(RangeQuery(2*curr+1,left,mid,leftq,rightq),RangeQuery(2*curr+2,mid+1,right,leftq,rightq));
    }
}