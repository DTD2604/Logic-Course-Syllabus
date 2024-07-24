package Chuoi_va_Thao_tac_chuoi;

import java.util.Scanner;

/* Bài tập 6: Đếm số từ trong chuỗi
Yêu cầu:
Nhập vào một chuỗi từ bàn phím.
Đếm và in ra số từ trong chuỗi đó.
Gợi ý:
Sử dụng phương thức split() để chia nhỏ chuỗi. */ 

public class Bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Chia nhỏ chuỗi bằng khoảng trắng
        String[] words = input.split("\\s+");

        // Đếm số từ
        int wordCount = words.length;

        // In ra số từ
        System.out.println("Số từ trong chuỗi là: " + wordCount);

        scanner.close();
    }
}