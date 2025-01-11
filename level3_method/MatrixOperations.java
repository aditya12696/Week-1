import java.util.Random;

public class MatrixOperations {

    // Method to generate a matrix with random values between 1 and 10
    public static int[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = random.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return sum;
    }

    // Method to subtract one matrix from another
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix1[0].length;
        int[][] difference = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                difference[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return difference;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length, cols = matrix2[0].length, commonDim = matrix1[0].length;
        int[][] product = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                for (int k = 0; k < commonDim; k++) {
                    product[row][col] += matrix1[row][k] * matrix2[k][col];
                }
            }
        }
        return product;
    }

    // Method to compute the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transposed[col][row] = matrix[row][col];
            }
        }
        return transposed;
    }

    // Method to compute the determinant of a 2x2 matrix
    public static int calculateDeterminant(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to calculate the inverse of a 2x2 matrix
    public static double[][] calculateInverse(int[][] matrix) {
        int determinant = calculateDeterminant(matrix);
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    // Method to display a matrix with integer values
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a matrix with double values
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Generate two 2x2 matrices
        int[][] matrix1 = generateMatrix(2, 2);
        int[][] matrix2 = generateMatrix(2, 2);

        // Display matrices
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        // Perform and display matrix operations
        System.out.println("Addition of Matrices:");
        printMatrix(addMatrices(matrix1, matrix2));

        System.out.println("Subtraction of Matrices:");
        printMatrix(subtractMatrices(matrix1, matrix2));

        System.out.println("Transpose of Matrix 1:");
        printMatrix(transposeMatrix(matrix1));

        System.out.println("Determinant of Matrix 1: " + calculateDeterminant(matrix1));

        System.out.println("Inverse of Matrix 1:");
        printMatrix(calculateInverse(matrix1));
    }
}
