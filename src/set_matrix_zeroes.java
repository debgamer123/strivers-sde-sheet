import java.util.HashSet;
import java.util.Set;

public class set_matrix_zeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> allRows = new HashSet<Integer>();
        Set<Integer> allColumns = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    allRows.add(i);
                    allColumns.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (allRows.contains(i) || allColumns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
