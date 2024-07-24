package Khai_bao_va_Khoi_tao_mang;

/* Khai báo và khởi tạo mảng
=========================
Bài tập 1: Khởi tạo mảng số nguyên và in ra các phần tử

- Yêu cầu:

Khởi tạo một mảng số nguyên gồm 5 phần tử với các giá trị từ 1 đến 5.
In ra các phần tử của mảng bằng vòng lặp for.

- Gợi ý:

Sử dụng cú pháp int[] arrayName = {value1, value2, ..., valueN}; để khởi tạo mảng.
Dùng vòng lặp for để duyệt qua các phần tử và in ra từng phần tử.

- Solution: */

public class Bai_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

