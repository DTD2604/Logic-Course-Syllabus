package ToanTu.solution;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if (number > 10 && number < 20) {
            if (number % 2 == 0) {
                System.out.println(number + " lớn hơn 10, nhỏ hơn 20 và là số chẵn.");
            } else {
                System.out.println(number + " lớn hơn 10, nhỏ hơn 20 nhưng không phải là số chẵn.");
            }
        } else {
            System.out.println(number + " không nằm trong khoảng từ 10 đến 20.");
        }
    }
}
