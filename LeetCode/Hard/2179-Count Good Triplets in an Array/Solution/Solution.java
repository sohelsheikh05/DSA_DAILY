class Solution {
    long segmentTree[];
    void Update(int left,int right,int curr,int idx){
        if(left==right){
            segmentTree[curr]=1;
            return ;
        }
        int mid=left+(right-left)/2;
        if(idx<=mid){
             Update(left,mid,2*curr+1,idx);
        }
        else
            Update(mid+1,right,2*curr+2,idx);

        segmentTree[curr]=segmentTree[2*curr+1]+segmentTree[2*curr+2];
    }
    long query(int l,int r,int curr,int left,int right){
        if(l>right || r<left)
         return 0;
        if (left >= l && r >= right) {
           return segmentTree[curr];
        } 
        int mid=left+(right-left)/2;
        return query(l,r,2*curr+1,left,mid)+query(l,r,2*curr+2,mid+1,right);
    }
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n=nums1.length;
        segmentTree=new long[4*n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        long count=0;
        Update(0,n-1,0,map.get(nums1[0]));
        for(int i=1;i<n;i++){
            long leftcommon=query(0,map.get(nums1[i]),0,0,n-1);
            long leftuncommon=i-leftcommon;
            long eleafterinums2=n-1-map.get(nums1[i]);
            long rightcommon=eleafterinums2-leftuncommon;
            count+=leftcommon*rightcommon;
            Update(0,n-1,0,map.get(nums1[i]));
        }
    return count;
    }
}