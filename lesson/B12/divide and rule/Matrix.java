public class StrassenMatrixMultiplication {
    public static void main(String[] args) {
        int N = 4;  // Kích thước của ma trận (N x N)
        int[][] A = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
        int[][] B = { {17, 18, 19, 20}, {21, 22, 23, 24}, {25, 26, 27, 28}, {29, 30, 31, 32} };

        int[][] C = strassen(A, B);

        System.out.println("Product of matrices A and B:");
        printMatrix(C);
    }

    public static int[][] strassen(int[][] A, int[][] B) {
        int n = A.length;

        if (n == 1) {
            int[][] C = {{A[0][0] * B[0][0]}};
            return C;
        } else {
            int newSize = n / 2;
            int[][] a11 = new int[newSize][newSize];
            int[][] a12 = new int[newSize][newSize];
            int[][] a21 = new int[newSize][newSize];
            int[][] a22 = new int[newSize][newSize];

            int[][] b11 = new int[newSize][newSize];
            int[][] b12 = new int[newSize][newSize];
            int[][] b21 = new int[newSize][newSize];
            int[][] b22 = new int[newSize][newSize];

            divide(A, a11, 0, 0);
            divide(A, a12, 0, newSize);
            divide(A, a21, newSize, 0);
            divide(A, a22, newSize, newSize);

            divide(B, b11, 0, 0);
            divide(B, b12, 0, newSize);
            divide(B, b21, newSize, 0);
            divide(B, b22, newSize, newSize);

            int[][] m1 = strassen(add(a11, a22), add(b11, b22));
            int[][] m2 = strassen(add(a21, a22), b11);
            int[][] m3 = strassen(a11, subtract(b12, b22));
            int[][] m4 = strassen(a22, subtract(b21, b11));
            int[][] m5 = strassen(add(a11, a12), b22);
            int[][] m6 = strassen(subtract(a21, a11), add(b11, b12));
            int[][] m7 = strassen(subtract(a12, a22), add(b21, b22));

            int[][] c11 = add(subtract(add(m1, m4), m5), m7);
            int[][] c12 = add(m3, m5);
            int[][] c21 = add(m2, m4);
            int[][] c22 = add(subtract(add(m1, m3), m2), m6);

            int[][] C = new int[n][n];
            combine(C, c11, 0, 0);
            combine(C, c12, 0, newSize);
            combine(C, c21, newSize, 0);
            combine(C, c22, newSize, newSize);

            return C;
        }
    }

    public static void divide(int[][] parent, int[][] child, int row, int col) {
        for (int i = 0; i < child.length; i++)
            for (int j = 0; j < child.length; j++)
                child[i][j] = parent[row + i][col + j];
    }

    public static void combine(int[][] parent, int[][] child, int row, int col) {
        for (int i = 0; i < child.length; i++)
            for (int j = 0; j < child.length; j++)
                parent[row + i][col + j] = child[i][j];
    }

    public static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row)
                System.out.print(elem + " ");
            System.out.println();
        }
    }
}
