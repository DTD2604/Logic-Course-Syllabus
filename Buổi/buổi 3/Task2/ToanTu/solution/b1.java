package ToanTu.solution;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của hình vuông: ");
        int squareLength = scanner.nextInt();

        int perimeter = 4 * squareLength;
        int area = squareLength * squareLength;

        System.out.println("Chu vi của hình vuông: " + perimeter);
        System.out.println("Diện tích của hình vuông: " + area);
    }
}
