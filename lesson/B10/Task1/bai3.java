public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Điểm dừng
        }
        return gcd(b, a % b); // Lời gọi đệ quy
    }
}
