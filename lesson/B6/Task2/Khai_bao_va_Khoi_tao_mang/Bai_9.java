package Khai_bao_va_Khoi_tao_mang;

/* Bài tập 9: Gộp hai mảng thành một

- Yêu cầu:

Khởi tạo hai mảng số nguyên với các giá trị bất kỳ.
Gộp hai mảng lại thành một mảng mới và in ra kết quả.

- Gợi ý:

Tạo một mảng mới có kích thước bằng tổng kích thước của hai mảng ban đầu và sao chép các phần tử vào mảng mới.

- Solution: */

public class Bai_9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        int[] mergedArray = new int[array1.length + array2.length];
        
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        
        System.out.print("Mảng sau khi gộp: ");
        for (int number : mergedArray) {
            System.out.print(number + " ");
        }
    }
}
