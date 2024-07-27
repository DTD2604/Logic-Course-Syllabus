public class Factorial {
    public static void main(String[] args) {
        int n = 5;  // Ví dụ tính giai thừa của 5
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Trường hợp cơ sở: 0! = 1
        } else {
            return n * factorial(n - 1);  // Trường hợp đệ quy
        }
    }
}
    