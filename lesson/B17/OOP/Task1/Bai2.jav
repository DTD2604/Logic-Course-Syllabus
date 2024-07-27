/*Bài tập 2: Quản lý sách trong thư viện
Xây dựng một chương trình Java để quản lý thông tin về các cuốn sách trong thư viện gồm các thuộc tính như Tên sách, Tác giả, Năm xuất bản. Yêu cầu:
•	Tạo lớp Book có các thuộc tính tương ứng.
•	Viết phương thức để nhập thông tin của sách từ bàn phím.
•	Viết phương thức để hiển thị thông tin của sách ra màn hình.
Hướng dẫn giải:*/
import java.util.Scanner;

// Lớp Book đơn giản
class Book {
    private String title;
    private String author;
    private int year;

    // Constructor có tham số
    public Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    // Phương thức để nhập thông tin từ bàn phím
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        title = scanner.nextLine();
        System.out.print("Enter book author: ");
        author = scanner.nextLine();
        System.out.print("Enter publication year: ");
        year = scanner.nextInt();
    }

    // Phương thức để hiển thị thông tin sách
    public void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + year);
    }
}

// Class chính để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Book và thực hiện nhập và hiển thị thông tin
        Book book = new Book("Unknown", "Unknown", 0);
        book.displayInfo(); // In ra thông tin mặc định

        // Nhập thông tin từ bàn phím
        book.inputInfo();
        // Hiển thị thông tin sau khi nhập
        book.displayInfo();
    }
}
