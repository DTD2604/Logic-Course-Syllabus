package Chuoi_va_Thao_tac_chuoi;

import java.util.Scanner;

/* Bài tập 9: Kiểm tra chuỗi đối xứng
Yêu cầu:
Nhập vào một chuỗi từ bàn phím.
Kiểm tra xem chuỗi đó có đối xứng hay không.
Gợi ý:
Sử dụng vòng lặp và phương thức charAt(). */ 

public class Bai_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Loại bỏ khoảng trắng và chuyển về chữ thường
        String sanitizedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Kiểm tra chuỗi đối xứng
        boolean isPalindrome = true;
        int length = sanitizedInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (sanitizedInput.charAt(i) != sanitizedInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // In ra kết quả
        if (isPalindrome) {
            System.out.println("Chuỗi là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi không phải là chuỗi đối xứng.");
        }

        scanner.close();
    }
}
