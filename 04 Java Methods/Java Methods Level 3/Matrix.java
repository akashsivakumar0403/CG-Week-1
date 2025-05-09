public class Matrix {
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = (int) (Math.random()*(10-0));
        return matrix;
    }
    public static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }
    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }
    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                result[j][i] = matrix[i][j];
        return result;
    }
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }
    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = {
                { m[1][1]/(double)det, -m[0][1]/(double)det },
                { -m[1][0]/(double)det, m[0][0]/(double)det }
        };
        return inv;
    }
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double)det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double)det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double)det;
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double)det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double)det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double)det;
        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double)det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double)det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double)det;
        return inv;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
        System.out.println();
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrixA = createRandomMatrix(3, 3);
        int[][] matrixB = createRandomMatrix(3, 3);
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        System.out.println("Addition (A + B):");
        displayMatrix(add(matrixA, matrixB));
        System.out.println("Subtraction (A - B):");
        displayMatrix(subtract(matrixA, matrixB));
        System.out.println("Multiplication (A * B):");
        displayMatrix(multiply(matrixA, matrixB));
        System.out.println("Transpose of A:");
        displayMatrix(transpose(matrixA));
        System.out.println("Determinant of A:");
        System.out.println(determinant3x3(matrixA));
        System.out.println("\nInverse of A:");
        double[][] invA = inverse3x3(matrixA);
        if (invA == null) {
            System.out.println("Matrix A is not invertible.");
        } else {
            displayMatrix(invA);
        }
    }
}
