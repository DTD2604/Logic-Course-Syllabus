/*Bài tập 5: Quản lý nhân viên
Viết một chương trình Java để quản lý thông tin về các nhân viên trong công ty gồm các thuộc tính như Tên nhân viên, Mã nhân viên, Bộ phận làm việc. Yêu cầu:

Tạo lớp Employee có các thuộc tính tương ứng.
Viết phương thức để nhập thông tin của nhân viên từ bàn phím.
Viết phương thức để hiển thị thông tin của nhân viên ra màn hình.
Hướng dẫn giải:*/
import java.util.Scanner;

// Lớp Employee đơn giản
class Employee {
    private String name;
    private String employeeCode;
    private String department;

    // Constructor có tham số
    public Employee(String n, String code, String dept) {
        name = n;
        employeeCode = code;
        department = dept;
    }

    // Phương thức để nhập thông tin từ bàn phím
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        name = scanner.nextLine();
        System.out.print("Enter employee's code: ");
        employeeCode = scanner.nextLine();
        System.out.print("Enter employee's department: ");
        department = scanner.nextLine();
    }

    // Phương thức để hiển thị thông tin nhân viên
    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Department: " + department);
    }
}

// Class chính để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Employee và thực hiện nhập và hiển thị thông tin
        Employee employee = new Employee("Unknown", "Unknown", "Unknown");
        employee.displayInfo(); // In ra thông tin mặc định

        // Nhập thông tin từ bàn phím
        employee.inputInfo();
        // Hiển thị thông tin sau khi nhập
        employee.displayInfo();
    }
}
