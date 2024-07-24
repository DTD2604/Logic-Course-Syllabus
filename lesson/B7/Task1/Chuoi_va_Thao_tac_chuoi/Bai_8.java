package Chuoi_va_Thao_tac_chuoi;

import java.util.Scanner;

/* Bài tập 8: Thay thế từ trong chuỗi
Yêu cầu:
Nhập vào một chuỗi và một từ cần thay thế, và từ thay thế từ bàn phím.
Thay thế tất cả các từ trong chuỗi và in ra kết quả.
Gợi ý:
Sử dụng phương thức replace(). */ 

public class Bai_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Nhập từ cần thay thế và từ thay thế
        System.out.print("Nhập từ cần thay thế: ");
        String oldWord = scanner.nextLine();
        System.out.print("Nhập từ thay thế: ");
        String newWord = scanner.nextLine();

        // Thay thế tất cả các từ trong chuỗi
        String replacedString = input.replace(oldWord, newWord);

        // In ra kết quả
        System.out.println("Chuỗi sau khi thay thế: " + replacedString);

        scanner.close();
    }
}
