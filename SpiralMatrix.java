import java.util.List;
import java.util.ArrayList;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // Edge case: empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of columns

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        // Traverse until boundaries cross
        while (top <= bottom && left <= right) {

            // Traverse from left → right (top row)
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // Traverse from top → bottom (right column)
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse from right → left (bottom row), if still valid
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Traverse from bottom → top (left column), if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
