package CauDieuKien.solution;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một năm: ");
        int year = scanner.nextInt();

        // Kiểm tra năm nhuận theo điều kiện đã cho
        String result;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            result = "Năm nhuận";
        } else {
            result = "Không là năm nhuận";
        }

        System.out.println("input: year = " + year);
        System.out.println("output: " + result);

        scanner.close();
    }
}
