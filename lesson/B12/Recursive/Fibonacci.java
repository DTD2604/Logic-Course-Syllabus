public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;  // Ví dụ tính số Fibonacci thứ 10
        int result = fibonacci(n);
        System.out.println("Fibonacci number " + n + " is: " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Trường hợp cơ sở: F(0) = 0, F(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Trường hợp đệ quy
        }
    }
}
