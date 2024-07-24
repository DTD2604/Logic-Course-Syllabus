package Ham;

// + Từ khóa void.
// + Hàm không có giá trị trả về.

public class Bai_3 {
    // 1. Viết một hàm printSquare nhận vào một tham số kiểu int và in ra bình phương của số đó.

    public static void printSquare(int n) {
        System.out.println("Square of " + n + " is " + (n * n));
    }

    // 2. Viết một hàm greetUser nhận vào một tham số kiểu String và in ra lời chào "Hello, [name]!".

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Bài Tập Về Nhà:

// 1. Viết một hàm printCube nhận vào một tham số kiểu int và in ra lập phương của số đó.
    /*// Định nghĩa hàm printCube
    public static void printCube(int number) {
        int cube = number * number * number;
        System.out.println("Lập phương của " + number + " là: " + cube);
    }

    public static void main(String[] args) {
        // Gọi hàm printCube với giá trị là 3
        printCube(3);
    }*/    
// 2. Viết một hàm displayMessage nhận vào hai tham số kiểu String và in ra dòng thông điệp kết hợp từ hai tham số.
    /*// Định nghĩa hàm displayMessage
    public static void displayMessage(String part1, String part2) {
        System.out.println(part1 + " " + part2);
    }

    public static void main(String[] args) {
        // Gọi hàm displayMessage với hai chuỗi
        displayMessage("Hello", "World!");
    }*/ 
}
