class NumArray {
    int segmentTree[];
    int Gright;
    public NumArray(int[] nums) {
        segmentTree=new int[4*nums.length];
        Gright=nums.length-1;
        BuildTree(0,0,nums.length-1,nums);
    }
    
    public void update(int index, int val) {
        Update(0,0,Gright,index,val);
    }
    
    public int sumRange(int left, int right) {
        return RangeQuery(0,0,Gright,left,right);
    }
    void BuildTree(int curr,int left,int right,int nums[]){
        if(left==right){
            segmentTree[curr]=nums[left];
            return ;
        }
        int mid=(left+right)/2;
        BuildTree(2*curr+1,left,mid,nums);
        BuildTree(2*curr+2,mid+1,right,nums);
        segmentTree[curr]=segmentTree[2*curr+1]+segmentTree[2*curr+2];
    }
    void Update(int curr,int left,int right,int index,int val){
        if(left==right){
            segmentTree[curr]=val;
            return ;
        }
        int mid=(left+right)/2;
        if(index<=mid)
         Update(2*curr+1,left,mid,index,val);
        else
        Update(2*curr+2,mid+1,right,index,val);
        segmentTree[curr]=segmentTree[2*curr+1]+segmentTree[2*curr+2];
    }
    int RangeQuery(int curr,int left,int right,int leftq,int rightq){
        if(leftq>right || rightq<left){
            
            return 0;
        }
        if (leftq <= left && rightq >= right) {
            return segmentTree[curr];
        }

        int mid=(left+right)/2;
    
        return RangeQuery(2*curr+1,left,mid,leftq,rightq)+RangeQuery(2*curr+2,mid+1,right,leftq,rightq);
    }
}


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */