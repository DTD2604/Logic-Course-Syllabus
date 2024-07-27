import java.util.Arrays;

public class AlternateSorting {
    public static void alternateSort(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                result[i] = arr[right--];
            else
                result[i] = arr[left++];
            flag = !flag;
        }

        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 2, 7, 5, 6, 4};
        alternateSort(arr);
        System.out.println("Alternately sorted array:");
        printArray(arr);
    }
}
