package Ham;

/* + Định nghĩa hàm là gì: 
    Hàm là một khối mã được định nghĩa riêng biệt để thực hiện một nhiệm vụ cụ thể. 

+ Tại sao sử dụng hàm trong lập trình: 
    Tái Sử Dụng Mã: Giảm việc viết lại mã giống nhau nhiều lần.
    Tổ Chức Mã: Giúp mã nguồn rõ ràng và dễ quản lý hơn.
    Bảo Trì Dễ Dàng: Dễ dàng chỉnh sửa và nâng cấp một phần cụ thể mà không ảnh hưởng đến toàn bộ chương trình.

+ Cấu trúc cơ bản của một hàm trong Java: phần khai báo <kiểu_trả_về> <tên_hàm>(<tham_số>) và phần thân {}.
 */ 

public class Bai_1 {
    // Viết một hàm sayHello in ra dòng chữ "Hello, World!".

    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    // Viết một hàm printName nhận vào một tham số kiểu String và in ra tên đó.

    public static void printName(String name) {
        System.out.println("Your name is: " + name);
    }

    // Bài Tập Về Nhà:

// 1. Viết một hàm sayGoodbye in ra dòng chữ "Goodbye!".
    
    // Solution:
    // Định nghĩa hàm sayGoodbye
    
    /*public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    public static void main(String[] args) {
        // Gọi hàm sayGoodbye
        sayGoodbye();
    }*/

// 2. Viết một hàm printAge nhận vào một tham số kiểu int và in ra tuổi của bạn.

    /*// Định nghĩa hàm printAge
    public static void printAge(int age) {
        System.out.println("Tuổi của bạn là: " + age);
    }

    public static void main(String[] args) {
        // Gọi hàm printAge với tuổi là 25
        printAge(25);
    }*/ 
}

