// kiểm tra xem số đó có phải là số nguyên tố hay không.
import java.util.Scanner;
public class SoNguyenTo {
    public static void main(String[] args) {
        isPrime = false;
    } else {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    if (isPrime) {
        System.out.println(n + " là số nguyên tố.");
    } else {
        System.out.println(n + " không phải là số nguyên tố.");
    }
}
