public class GCDArray {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int findGCD(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return gcd(arr[n - 1], findGCD(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 21, 30, 18};
        int n = arr.length;
        int result = findGCD(arr, n);
        System.out.println("GCD of the array is: " + result);
    }
}
