public class SumOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = sumOdd(numbers);
        System.out.println("Sum of odd numbers: " + result);
    }

    public static int sumOdd(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}
