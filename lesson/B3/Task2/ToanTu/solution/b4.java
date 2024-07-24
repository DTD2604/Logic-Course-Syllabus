package ToanTu.solution;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int number1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " lớn hơn " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " nhỏ hơn " + number2);
        } else {
            System.out.println(number1 + " bằng " + number2);
        }

        if ((number1 > 0 && number2 > 0) || (number1 < 0 && number2 < 0)) {
            System.out.println("Hai số cùng dấu.");
        } else if (number1 == 0 || number2 == 0) {
            System.out.println("Một trong hai số là 0.");
        } else {
            System.out.println("Hai số khác dấu.");
        }
    }
}
