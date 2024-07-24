package CauDieuKien.solution;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhận đầu vào từ người dùng
        System.out.print("nhập số dòng code: ");
        int totalLine = scanner.nextInt();

        System.out.print("nhập số giờ làm: ");
        int timeDoing = scanner.nextInt();

        // Tính tổng thu nhập trước chi phí
        int incomeBeforeExpense = timeDoing * 20;

        // Khai báo chi phí review code
        int reviewCost = 0;

        // Sử dụng câu điều kiện để xác định chi phí review code
        if (totalLine < 10) {
            reviewCost = 1;
        } else if (totalLine <= 20) {
            reviewCost = 2;
        } else {
            reviewCost = 5;
        }

        // Tính thu nhập thực lãnh
        int actualIncome = incomeBeforeExpense - reviewCost;

        // In ra kết quả
        System.out.println("Salary: " + actualIncome + "$");

        // Đóng đối tượng Scanner
        scanner.close();
    }
}
