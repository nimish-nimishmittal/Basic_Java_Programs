import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int columns = scanner.nextInt();
        System.out.println("\nEnter the first matrix:");
        int[][] matrix1 = inputMatrix(rows, columns, scanner);
        System.out.println("\nEnter the second matrix:");
        int[][] matrix2 = inputMatrix(rows, columns, scanner);
        int[][] resultMatrix = addMatrices(matrix1, matrix2);
        System.out.println("\nResultant Matrix after addition:");
        displayMatrix(resultMatrix);
        scanner.close();
    }
    private static int[][] inputMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
