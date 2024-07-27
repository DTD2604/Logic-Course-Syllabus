public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, 8, 6};  // Ví dụ mảng
        int max = findMax(arr, 0, arr.length - 1);
        System.out.println("Maximum value in the array is: " + max);
    }

    public static int findMax(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];  // Trường hợp cơ sở: chỉ có một phần tử
        }

        int mid = (left + right) / 2;
        int maxLeft = findMax(arr, left, mid);  // Đệ quy tìm max trong nửa trái
        int maxRight = findMax(arr, mid + 1, right);  // Đệ quy tìm max trong nửa phải

        return Math.max(maxLeft, maxRight);  // Kết hợp kết quả
    }
}
