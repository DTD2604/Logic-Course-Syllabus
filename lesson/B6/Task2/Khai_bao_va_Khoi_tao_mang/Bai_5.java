package Khai_bao_va_Khoi_tao_mang;

/* Bài tập 5: Kiểm tra mảng đối xứng

- Yêu cầu:

Khởi tạo một mảng số nguyên gồm 7 phần tử với các giá trị bất kỳ.
Kiểm tra xem mảng có phải là mảng đối xứng hay không và in ra kết quả.

- Gợi ý:

Sử dụng vòng lặp for để so sánh các phần tử ở vị trí đầu và cuối.

- Solution:
 */ 

 public class Bai_5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 3, 2, 1};
        boolean isPalindrome = true;
        
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("The array is symmetrical.");
        } else {
            System.out.println("The array is not symmetrical.");
        }
    }
}
