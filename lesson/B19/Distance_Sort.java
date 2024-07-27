import java.util.*;

public class DistanceSort {
    public static void distanceSort(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            double distA = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
            double distB = Math.sqrt(b[0] * b[0] + b[1] * b[1]);
            return Double.compare(distA, distB);
        });
    }

    public static void printArray(int[][] arr) {
        for (int[] point : arr) {
            System.out.println(Arrays.toString(point));
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 3}, {1, 1}, {0, 2}, {4, 4}, {1, 2}};
        distanceSort(arr);
        System.out.println("Sorted array by distance from origin:");
        printArray(arr);
    }
}
