public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = reverse(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str; // Điểm dừng
        }
        return reverse(str.substring(1)) + str.charAt(0); // Lời gọi đệ quy
    }
}
