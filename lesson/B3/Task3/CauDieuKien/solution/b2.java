package CauDieuKien.solution;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap tu can kiem tra: ");
        char character = sc.next().charAt(0);
        System.out.println("input: character = '" + character + "'");
        sc.close();

        switch (character) {
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("output: Nguyen am");
                break;
            default:
                System.out.println("output: khong phai nguyen am");
                break;
        }
    }
}
