class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0;i<n-1;i++){
            if(min==arr[i+1]-arr[i]){
                res.add(new ArrayList<>(Arrays.asList(arr[i],arr[i+1])));
            }
        }
    return res;
    }
}