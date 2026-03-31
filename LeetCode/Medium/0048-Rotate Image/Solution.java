class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Transpose the matrix. [0][1] => [1][0]

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                // j is starting from i's index as prev indexes less than i is not necessary
                if (i != j) {
                    // i == j is anyway the same index and same element.
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        // Reverse the rows of the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2 ; j++) {
                // Half indexes are enough to reverse
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m - 1 - j]; // [0][2] = [0][3-1-2]
                matrix[i][m - 1 - j] = temp;
            }
        }

    }
}