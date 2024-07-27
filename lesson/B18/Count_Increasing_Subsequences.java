public class IncreasingSubsequences {
    public static int countIncreasingSubsequences(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
                for (int j = i + 1; j < n - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int count = countIncreasingSubsequences(arr);
        System.out.println("Number of increasing subsequences: " + count);
    }
}
