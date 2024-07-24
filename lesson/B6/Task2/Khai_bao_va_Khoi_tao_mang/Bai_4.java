package Khai_bao_va_Khoi_tao_mang;

/* Bài tập 4: Đảo ngược mảng

- Yêu cầu:

Khởi tạo một mảng số nguyên gồm 6 phần tử với các giá trị bất kỳ.
Đảo ngược mảng và in ra kết quả.

- Gợi ý:

Sử dụng vòng lặp for để hoán đổi các phần tử ở vị trí đầu và cuối.

- Solution:
 */ 

 public class Bai_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        
        System.out.print("Array after inversion: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
