import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);

        return result;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 9, 6, 7, 6, 8, 9, 4};
        int[] result = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        printArray(result);
    }
}
