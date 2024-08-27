class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        if (r == m && c == n) {
            return mat;
        }
        int n_index = 0;
        int o_index = 0;
        int n_mat[][] = new int[r][c];
        while (n_index < r * c && o_index < m * n) {
            n_mat[n_index / c][n_index % c] = mat[o_index / n][o_index % n];
            n_index++;
            o_index++;
        }
        return n_mat;
    }
}


//or

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;  // Return the original matrix if reshaping isn't possible
        }
        int[][] ans = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    row++;
                    col = 0;
                }
            }
        }
        return ans;
    }
}
