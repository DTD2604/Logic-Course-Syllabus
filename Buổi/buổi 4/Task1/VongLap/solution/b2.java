package VongLap.solution;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Giai thừa của " + n + " là: " + factorial);
    }
}
