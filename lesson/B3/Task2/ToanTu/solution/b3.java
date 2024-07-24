package ToanTu.solution;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 65) {
            System.out.println("Tuổi của bạn nằm trong khoảng từ 18 đến 65 và hợp lệ để đăng ký bầu cử.");
        } else if (age < 18) {
            System.out.println("Tuổi của bạn nhỏ hơn 18, không hợp lệ để đăng ký bầu cử.");
        } else {
            System.out.println("Tuổi của bạn lớn hơn 65, không hợp lệ để đăng ký bầu cử.");
        }
    }
}
