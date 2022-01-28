package array;

public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {

        int[][] results = new int[n][n];
        int t = 0;
        int b = n - 1;
        int l = 0;
        int r = n - 1;
        int index = 1;
        while (index <= n * n) {
            for (int i = l; i <= r; i++) {
                results[t][i] = index++;
            }
            t++;

            for (int i = t; i <= b; i++) {
                results[i][r] = index++;
            }
            r--;

            for (int i = r; i >= l; i-- ) {
                results[b][i] = index++;
            }
            b--;

            for (int i = b; i >= t; i--) {
                results[i][l] = index++;
            }
            l++;

        }
        return results;
    }
}
