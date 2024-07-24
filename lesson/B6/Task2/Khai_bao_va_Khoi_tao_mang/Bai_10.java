package Khai_bao_va_Khoi_tao_mang;

/* Bài tập 10: Tạo mảng 2 chiều và in ra ma trận

- Yêu cầu:

Khởi tạo một mảng 2 chiều với các giá trị bất kỳ.
In ra ma trận từ mảng 2 chiều đó.

- Gợi ý:

Sử dụng vòng lặp for lồng nhau để duyệt qua các phần tử trong mảng 2 chiều và in ra ma trận.

- Solution: */ 

public class Bai_10 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
