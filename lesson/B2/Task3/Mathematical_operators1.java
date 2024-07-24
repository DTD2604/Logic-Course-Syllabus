// Tính diện tích hình chữ nhật
public class Rectangle {
    public static void main(String[] args) {
        double length = 10.5;
        double width = 5.5;

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chu vi: " + perimeter);
        System.out.println("Diện tích: " + area);
    }
}
