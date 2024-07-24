package VongLap.solution;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy Fibonacci: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.print("Dãy Fibonacci với " + n + " phần tử: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
