package Khai_bao_va_Khoi_tao_mang;

/*Bài tập 3: Tìm giá trị lớn nhất trong mảng

- Yêu cầu:

Khởi tạo một mảng số nguyên gồm 8 phần tử với các giá trị bất kỳ.
Tìm giá trị lớn nhất trong mảng và in ra kết quả.

- Gợi ý:

Sử dụng vòng lặp for để duyệt qua các phần tử và tìm giá trị lớn nhất.

- Solution:*/

public class Bai_3 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4, 5, 1, 8};
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("The largest value in the array is: " + max);
    }
}
