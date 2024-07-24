package Chuoi_va_Thao_tac_chuoi;

import java.util.Scanner;

/* Bài tập 10: Tìm từ dài nhất trong chuỗi
Yêu cầu:
Nhập vào một chuỗi từ bàn phím.
Tìm và in ra từ dài nhất trong chuỗi đó.
Gợi ý:
Sử dụng phương thức split() và vòng lặp để duyệt qua các từ. */ 

public class Bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Chia nhỏ chuỗi thành các từ
        String[] words = input.split("\\s+");

        // Tìm từ dài nhất
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // In ra từ dài nhất
        System.out.println("Từ dài nhất trong chuỗi là: " + longestWord);

        scanner.close();
    }
}
