package CauDieuKien.solution;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tháng và năm
        System.out.print("Nhập vào năm: ");
        int year = scanner.nextInt();

        System.out.print("Nhập vào tháng: ");
        int month = scanner.nextInt();

        // Kiểm tra số ngày trong tháng
        int days = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ.");
                System.exit(0);
        }

        // In ra kết quả
        System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");

        scanner.close();
    }
}
