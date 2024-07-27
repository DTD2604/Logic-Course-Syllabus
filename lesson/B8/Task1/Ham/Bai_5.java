package Ham;

// + Sử dụng hàm để giải các bài toán.
// + Tổ chức mã nguồn sử dụng hàm.

public class Bai_5 {
    // 1. Viết một hàm findMax nhận vào ba tham số kiểu int và trả về giá trị lớn nhất.

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // 2. Viết một hàm isPrime nhận vào một tham số kiểu int và trả về true nếu số đó là số nguyên tố, ngược lại trả về false.

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Bài Tập Về Nhà:
    
// 1. Viết một hàm gcd nhận vào hai tham số kiểu int và trả về ước chung lớn nhất của chúng.
    /*// Định nghĩa hàm gcd
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Gọi hàm gcd và in ra kết quả
        int result = gcd(56, 98);
        System.out.println("Ước chung lớn nhất là: " + result);
    }*/ 
    
// 2. Viết một hàm factorial nhận vào một tham số kiểu int và trả về giai thừa của số đó.
    /*// Định nghĩa hàm factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Gọi hàm factorial và in ra kết quả
        int result = factorial(5);
        System.out.println("Giai thừa của 5 là: " + result);
    }*/ 
}
