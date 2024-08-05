public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7, 6};
        int result = findSecondLargest(numbers);
        System.out.println("Second largest number: " + result);
    }

    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
}
