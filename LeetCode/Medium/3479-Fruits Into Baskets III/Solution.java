class Solution {
    int segmentTree[];
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=baskets.length;
        segmentTree=new int[4*n];
        int max=0;
        for(int num:baskets)max=Math.max(max,num);
        Build(0,0,n-1,baskets); //build(curr,left,right)
        boolean  placed[] =new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            int pos=Query(0,0,n-1,placed,baskets,fruits[i]);
            if(pos!=-1){
                placed[pos]=true;
                Update(0,0,n-1,pos);
            }
            else{
               count++;
            }
        }
    return count;
    }
    void Build(int curr,int left,int right,int[] baskets){
        if(left==right){
            segmentTree[curr]=baskets[left];
            return ;
        }
        int mid=left+(right-left)/2;
        Build(2*curr+1,left,mid,baskets);
        Build(2*curr+2,mid+1,right,baskets);
        int leftmax=segmentTree[2*curr+1];
        int rightmax=segmentTree[2*curr+2];
        segmentTree[curr]=Math.max(leftmax,rightmax);
    }
    int Query(int curr,int left,int right,boolean placed[],int baskets[],int fruit){
        if(segmentTree[curr]<fruit) return -1;
        if(left==right) return left;
        int mid=left+(right-left)/2;
        if(segmentTree[2*curr+1]>=fruit)
        return Query(2*curr+1,left,mid,placed,baskets,fruit);
        else
         return Query(2*curr+2,mid+1,right,placed,baskets,fruit);
    }
    void Update(int curr,int left,int right,int pos){
          if (left==right) {
            segmentTree[curr] = -1; // mark basket used
            return;
        }
        int mid = (left+right) / 2;
        if (pos <= mid)
            Update(2 * curr + 1, left, mid, pos);
        else
            Update(2 * curr + 2, mid + 1, right, pos);

        segmentTree[curr] = Math.max(segmentTree[2 * curr + 1], segmentTree[2 * curr + 2]);
    }
}