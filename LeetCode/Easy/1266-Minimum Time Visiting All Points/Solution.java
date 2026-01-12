class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=0;i<points.length-1;i++){
            int first=Math.abs(points[i][0]-points[i+1][0]);
            int second=Math.abs(points[i][1]-points[i+1][1]);
            ans+=Math.max(first,second);
        }
    return ans;
    }
}