package Khai_bao_va_Khoi_tao_mang;


/* Bài tập 7: Đếm số lần xuất hiện của một phần tử trong mảng

- Yêu cầu:

Khởi tạo một mảng số nguyên gồm 10 phần tử với các giá trị bất kỳ.
Đếm số lần xuất hiện của một phần tử cho trước trong mảng và in ra kết quả.

- Gợi ý:

Sử dụng vòng lặp for để duyệt qua các phần tử và đếm số lần xuất hiện của phần tử đó.

- Solution: */ 

public class Bai_7 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 3, 8, 3, 9, 1, 3, 4, 3};
        int target = 3;
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        
        System.out.println("Phần tử " + target + " xuất hiện " + count + " lần trong mảng.");
    }
}
