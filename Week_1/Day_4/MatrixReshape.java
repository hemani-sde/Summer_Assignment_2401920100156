class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        for (int k = 0; k < m * n; k++) {
            ans[k / c][k % c] = mat[k / n][k % n];
        }

        return ans;
    }
}
