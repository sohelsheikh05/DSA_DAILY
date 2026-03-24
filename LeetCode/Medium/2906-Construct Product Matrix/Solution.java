class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod = 12345;
        int n = grid.length, m = grid[0].length;
        int size = n * m;

        int[] prefix = new int[size];
        int[] suffix = new int[size];

        // prefix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int ind = i * m + j;
                if(ind == 0) prefix[ind] = grid[i][j] % mod;
                else prefix[ind] = (int)((1L * prefix[ind - 1] * grid[i][j]) % mod);
            }
        }

        // suffix
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                int ind = i * m + j;
                if(ind == size - 1) suffix[ind] = grid[i][j] % mod;
                else suffix[ind] = (int)((1L * suffix[ind + 1] * grid[i][j]) % mod);
            }
        }

        int[][] res = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int ind = i * m + j;

                int left = (ind > 0) ? prefix[ind - 1] : 1;
                int right = (ind < size - 1) ? suffix[ind + 1] : 1;

                res[i][j] = (int)((1L * left * right) % mod);
            }
        }

        return res;
    }
}