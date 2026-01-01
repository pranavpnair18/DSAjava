package Arrays;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
        };

        setZeroes(matrix);  // Call the function that modifies the matrix

        // Print the modified matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;       // Number of rows
        int n = matrix[0].length;    // Number of columns

        // Step 1: Create two arrays to mark rows and columns to be zeroed
        boolean[] row = new boolean[m];  // row[i] is true if row i should be zero
        boolean[] col = new boolean[n];  // col[j] is true if column j should be zero

        // Step 2: Traverse the matrix to find zeroes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;  // Mark this row
                    col[j] = true;  // Mark this column
                }
            }
        }

        // Step 3: Traverse again and set elements to zero if they are in a marked row or column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
