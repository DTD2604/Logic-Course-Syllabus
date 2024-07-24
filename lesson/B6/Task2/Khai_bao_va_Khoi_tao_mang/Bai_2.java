package Khai_bao_va_Khoi_tao_mang;


/*
Bài tập 2: Khởi tạo mảng và tính tổng các phần tử

- Yêu cầu:

Khởi tạo một mảng số nguyên gồm 10 phần tử với các giá trị từ 1 đến 10.
Tính tổng các phần tử trong mảng và in ra kết quả.

- Gợi ý:

Sử dụng vòng lặp for để tính tổng các phần tử.

- Solution: */

public class Bai_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}

