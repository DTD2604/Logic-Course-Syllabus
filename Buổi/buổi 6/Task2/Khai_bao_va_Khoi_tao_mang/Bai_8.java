package Khai_bao_va_Khoi_tao_mang;

/* Bài tập 8: Sắp xếp mảng theo thứ tự tăng dần

- Yêu cầu:

Khởi tạo một mảng số nguyên gồm 6 phần tử với các giá trị bất kỳ.
Sắp xếp mảng theo thứ tự tăng dần và in ra kết quả.

- Gợi ý:

Sử dụng thuật toán sắp xếp cơ bản như Bubble Sort để sắp xếp mảng.

- Solution: */ 

public class Bai_8 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2, 7};
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
