package Chuoi_va_Thao_tac_chuoi;

import java.util.Scanner;

/* Bài tập 7: Đảo ngược từng từ trong chuỗi
Yêu cầu:
Nhập vào một chuỗi từ bàn phím.
Đảo ngược từng từ trong chuỗi và in ra kết quả.
Gợi ý:
Sử dụng phương thức split() và StringBuilder. */ 

public class Bai_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Chia nhỏ chuỗi thành các từ
        String[] words = input.split("\\s+");

        // Đảo ngược từng từ
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reversedString.append(reverseWord.reverse().toString()).append(" ");
        }

        // In ra kết quả
        System.out.println("Chuỗi sau khi đảo ngược từng từ: " + reversedString.toString().trim());

        scanner.close();
    }
}
