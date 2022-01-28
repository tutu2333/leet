package array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> results = new ArrayList<>();
        int t = 0;
        int b = m - 1;
        int l = 0;
        int r = n - 1;
        int index = 0;
        while (index < m * n) {
            for (int i = l; i <= r && index < m * n; i++) {
                results.add(matrix[t][i]);
                index++;
            }
            t++;

            for (int i = t; i <= b && index < m * n; i++) {
                 results.add(matrix[i][r]);
                index++;
            }
            r--;

            for (int i = r; i >= l && index < m * n; i-- ) {
                 results.add(matrix[b][i]);
                index++;
            }
            b--;

            for (int i = b; i >= t && index < m * n; i--) {
                results.add(matrix[i][l]);
                index++;
            }
            l++;

        }
        return results;
    }

}
