/*Bài tập 4: Quản lý phòng học
Xây dựng một chương trình Java để quản lý thông tin về các phòng học gồm các thuộc tính như Mã phòng, Dung lượng, Loại phòng (lab, học lý thuyết, thí nghiệm...). Yêu cầu:

Tạo lớp Classroom có các thuộc tính tương ứng.
Viết phương thức để nhập thông tin của phòng học từ bàn phím.
Viết phương thức để hiển thị thông tin của phòng học ra màn hình.
Hướng dẫn giải:*/
import java.util.Scanner;

// Lớp Classroom đơn giản
class Classroom {
    private String roomCode;
    private int capacity;
    private String roomType;

    // Constructor có tham số
    public Classroom(String code, int cap, String type) {
        roomCode = code;
        capacity = cap;
        roomType = type;
    }

    // Phương thức để nhập thông tin từ bàn phím
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter room code: ");
        roomCode = scanner.nextLine();
        System.out.print("Enter room capacity: ");
        capacity = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter room type: ");
        roomType = scanner.nextLine();
    }

    // Phương thức để hiển thị thông tin phòng học
    public void displayInfo() {
        System.out.println("Classroom Information:");
        System.out.println("Room Code: " + roomCode);
        System.out.println("Capacity: " + capacity);
        System.out.println("Room Type: " + roomType);
    }
}

// Class chính để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Classroom và thực hiện nhập và hiển thị thông tin
        Classroom classroom = new Classroom("Unknown", 0, "Unknown");
        classroom.displayInfo(); // In ra thông tin mặc định

        // Nhập thông tin từ bàn phím
        classroom.inputInfo();
        // Hiển thị thông tin sau khi nhập
        classroom.displayInfo();
    }
}
