package Khai_bao_va_Khoi_tao_mang;

/* Bài tập 6: Tính giá trị trung bình của các phần tử trong mảng

- Yêu cầu:

Khởi tạo một mảng số nguyên gồm 5 phần tử với các giá trị bất kỳ.
Tính giá trị trung bình của các phần tử trong mảng và in ra kết quả.

- Gợi ý:

Tính tổng các phần tử và sau đó chia cho số lượng phần tử trong mảng để có giá trị trung bình.

- Solution: */ 

public class Bai_6 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 5};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        double average = (double) sum / numbers.length;
        System.out.println("Giá trị trung bình của các phần tử trong mảng là: " + average);
    }
}