import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi: ");
        String str = scanner.nextLine();

        System.out.print("Nhập một ký tự: ");
        char ch = scanner.next().charAt(0);

        if (str.isEmpty() || ch == ' ') {
            System.out.println("Dữ liệu nhập vào không hợp lệ.");
            return;
        }

        // Sử dụng phương thức replaceAll() để đếm số lần xuất hiện
        String strWithoutDuplicates = str.replaceAll(String.valueOf(ch), "");
        int count = str.length() - strWithoutDuplicates.length();

        System.out.println("Số lần xuất hiện của ký tự '" + ch + "' trong chuỗi là: " + count);
    }
}