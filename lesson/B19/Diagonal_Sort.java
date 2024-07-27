import java.util.*;

public class DiagonalSort {
    public static void diagonalSort(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Map<Integer, PriorityQueue<Integer>> diagonalMap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                diagonalMap.putIfAbsent(key, new PriorityQueue<>());
                diagonalMap.get(key).add(matrix[i][j]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                matrix[i][j] = diagonalMap.get(key).poll();
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        diagonalSort(matrix);
        System.out.println("Diagonally sorted matrix:");
        printMatrix(matrix);
    }
}
