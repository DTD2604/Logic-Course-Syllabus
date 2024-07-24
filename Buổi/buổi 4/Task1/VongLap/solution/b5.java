package VongLap.solution;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước cạnh của hình vuông: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // In dấu sao (*) ở các cạnh
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    // In khoảng trắng ở phần bên trong
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
