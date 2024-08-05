package Mang.solution;

import java.util.Scanner;

//giải pháp:
public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần đếm: ");
        int x = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của " + x + " là: " + count);
    }

}
