
public class MatrixTranspose {
    public static void main(String[] args) {
        // original 2x3 matrix
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // transpose will be 3x2
        int[][] transpose = new int[3][2];

        // logic for transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // printing transpose
        System.out.println("Transpose of matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
