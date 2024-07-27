// Bài 2: Khai báo một mảng 2 chiều 3x3 các số nguyên, tính tổng các phần tử trên đường chéo chính và đường chéo phụ.
public class DiagonalSumCalculator {
    public static void main(String[] args) {
        // Khai báo mảng 2 chiều 3x3 các số nguyên
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Tính tổng các phần tử trên đường chéo chính
        int mainDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            mainDiagonalSum += matrix[i][i];
        }

        // Tính tổng các phần tử trên đường chéo phụ
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < 3; i++) {
            secondaryDiagonalSum += matrix[i][2 - i];
        }

        // In kết quả
        System.out.println("Tổng các phần tử trên đường chéo chính: " + mainDiagonalSum);
        System.out.println("Tổng các phần tử trên đường chéo phụ: " + secondaryDiagonalSum);
    }
}