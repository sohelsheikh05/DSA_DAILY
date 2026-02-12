class Solution {
    int smin[];
    int smax[];
    int lazy[];
    public int longestBalanced(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int n=nums.length;
      smin=new int[4*n];
      smax=new int[4*n];
      lazy=new int[4*n];
      int maxl=0;
      for(int i=0;i<n;i++){
        int val=(nums[i]%2==0)?1:-1;
        int prev=-1;
        if(map.containsKey(nums[i])) prev=map.get(nums[i]);

        if(prev!=-1){
            update(0,prev,0,0,n-1,-val);
        }
        update(0,i,0,0,n-1,val);
        int l=findLeftMostZero(0,0,n-1);
        if(l!=-1) maxl=Math.max(maxl,i-l+1);
        map.put(nums[i],i);
      }
    return maxl;
    }
    void update(int l,int r,int curr,int left,int right,int val){
        propagate(curr,left,right);
        if (r < left || l > right) {
                 return;
            }

        if (l <= left && right <= r){
            lazy[curr]+=val;
            propagate(curr,left,right);
            return;
        }
        int mid=(left+right)/2;
        update(l,r,2*curr+1,left,mid,val);
        update(l,r,2*curr+2,mid+1,right,val);
        smin[curr]=Math.min(smin[2*curr+1],smin[2*curr+2]);
        smax[curr]=Math.max(smax[2*curr+1],smax[2*curr+2]);
    }
    void propagate(int curr,int l,int r){
        if(lazy[curr]!=0){
            smin[curr]+=lazy[curr];
            smax[curr]+=lazy[curr];
            if(l!=r){
                lazy[2*curr+1]+=lazy[curr];
                lazy[2*curr+2]+=lazy[curr];
            }
            lazy[curr]=0;
        }
    }
    int findLeftMostZero(int curr,int l,int r){
        propagate(curr,l,r);
        if(smin[curr]>0 || smax[curr]<0) return -1;
        if(l==r) return  l;
        int mid=(l+r)/2;
        int left=findLeftMostZero(2*curr+1,l,mid);
        if(left!=-1) return left;
        int right=findLeftMostZero(2*curr+2,mid+1,r);
        return right;
    }
}