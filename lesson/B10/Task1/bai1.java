public class SumToN {
    public static void main(String[] args) {
        int n = 10;
        int result = sum(n);
        System.out.println("Sum from 1 to " + n + " is: " + result);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1; // Điểm dừng
        }
        return n + sum(n - 1); // Lời gọi đệ quy
    }
}
