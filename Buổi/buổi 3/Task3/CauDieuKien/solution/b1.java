package CauDieuKien.solution;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int yourNumber = scanner.nextInt();

        String result;
        if (yourNumber > 0) {
            if (yourNumber % 2 == 0) {
                result = "Số nguyên dương chẵn";
            } else {
                result = "Số nguyên dương lẻ";
            }
        } else if (yourNumber < 0) {
            if (yourNumber % 2 == 0) {
                result = "Số nguyên âm chẵn";
            } else {
                result = "Số nguyên âm lẻ";
            }
        } else {
            result = "Số không";
        }

        System.out.println("input: yourNumber = " + yourNumber);
        System.out.println("output: " + result);

        scanner.close();
    }
}
