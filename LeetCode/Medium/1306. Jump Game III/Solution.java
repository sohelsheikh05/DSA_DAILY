class Solution {
    int n;
    boolean visited[];
    public boolean canReach(int[] arr, int start) {
        n=arr.length;
        visited=new boolean[n];
        return solve(start,arr);
    }
    boolean solve(int curr,int arr[]){
        if(arr[curr]==0) return true;
        visited[curr]=true;
        return ((curr-arr[curr]>=0 && !visited[curr-arr[curr]]  && solve(curr-arr[curr],arr)) || (curr+arr[curr]<n && !visited[curr+arr[curr]] && solve(curr+arr[curr],arr)));
    }
}