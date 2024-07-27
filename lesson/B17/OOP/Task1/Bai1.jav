/*Bài tập 1: Quản lý sinh viên
Hãy viết một chương trình Java để quản lý thông tin sinh viên gồm các thuộc tính như Tên, Tuổi, Địa chỉ. Yêu cầu:
•	Tạo lớp Student có các thuộc tính tương ứng.
•	Viết phương thức để nhập thông tin của sinh viên từ bàn phím.
•	Viết phương thức để hiển thị thông tin của sinh viên ra màn hình.
Hướng dẫn giải:*/
import java.util.Scanner;

// Lớp Student đơn giản
class Student {
    private String name;
    private int age;
    private String address;

    // Constructor có tham số
    public Student(String n, int a, String addr) {
        name = n;
        age = a;
        address = addr;
    }

    // Phương thức để nhập thông tin từ bàn phím
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        System.out.print("Enter student's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter student's address: ");
        address = scanner.nextLine();
    }

    // Phương thức để hiển thị thông tin sinh viên
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Class chính để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Student và thực hiện nhập và hiển thị thông tin
        Student student = new Student("Unknown", 0, "Unknown");
        student.displayInfo(); // In ra thông tin mặc định

        // Nhập thông tin từ bàn phím
        student.inputInfo();
        // Hiển thị thông tin sau khi nhập
        student.displayInfo();
    }
}

