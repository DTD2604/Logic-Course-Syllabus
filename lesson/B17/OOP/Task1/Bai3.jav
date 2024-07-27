/*Bài tập 3: Quản lý hóa đơn
Viết một chương trình Java để quản lý thông tin về hóa đơn bao gồm các thuộc tính như Số hóa đơn, Ngày xuất hóa đơn, Tổng tiền. Yêu cầu:

Tạo lớp Invoice có các thuộc tính tương ứng.
Viết phương thức để tính tổng tiền hóa đơn (có thể truyền vào danh sách các mặt hàng và số lượng).
Viết phương thức để hiển thị thông tin của hóa đơn ra màn hình.
Hướng dẫn giải:*/
import java.util.Scanner;

// Lớp Invoice đơn giản
class Invoice {
    private String invoiceNumber;
    private String invoiceDate;
    private double totalAmount;

    // Constructor có tham số
    public Invoice(String num, String date, double amount) {
        invoiceNumber = num;
        invoiceDate = date;
        totalAmount = amount;
    }

    // Phương thức để tính tổng tiền hóa đơn
    public void calculateTotal(double[] items, int[] quantities) {
        totalAmount = 0;
        for (int i = 0; i < items.length; i++) {
            totalAmount += items[i] * quantities[i];
        }
    }

    // Phương thức để hiển thị thông tin hóa đơn
    public void displayInfo() {
        System.out.println("Invoice Information:");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Invoice Date: " + invoiceDate);
        System.out.println("Total Amount: $" + totalAmount);
    }
}

// Class chính để kiểm tra
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Invoice và thực hiện tính toán và hiển thị thông tin
        Invoice invoice = new Invoice("INV-001", "2024-07-19", 0);
        
        double[] items = {10.5, 20.75, 15.0}; // Giá của từng mặt hàng
        int[] quantities = {2, 1, 3}; // Số lượng của từng mặt hàng
        
        // Tính tổng tiền hóa đơn
        invoice.calculateTotal(items, quantities);
        // Hiển thị thông tin sau khi tính toán
        invoice.displayInfo();
    }
}
