import java.util.Arrays;

/**
 * RotateMatrix
 */
public class RotateMatrix {

    // rotate matrix algorithm
    public int[][] rotate(int matrix[][], int length) {
        int newMatrix[][] = new int[length][length];
        int i = 0, j = 0;
        // outer loop will parse columns
        // inner loop will parse rows
        for (int col = 0; col < matrix.length; col++) {
            j = 0;
            for (int row = matrix.length - 1; row >= 0; row--) {
                newMatrix[i][j++] = matrix[row][col];
            }
            i++;
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        RotateMatrix rm = new RotateMatrix();
        int matrix[][] = { { 1, 2 }, { 7, 8 } };
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.deepToString(rm.rotate(matrix, matrix.length)));
        long endTime = System.currentTimeMillis();
        System.out.println("Time:- " + (endTime - startTime));
    }
}
