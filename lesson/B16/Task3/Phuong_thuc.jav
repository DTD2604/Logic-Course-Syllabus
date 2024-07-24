// Lớp đơn giản Car (tiếp tục từ ví dụ trước)
public class Car {
    // Các thuộc tính của Car
    private String brand;  // Nhãn hiệu
    private String model;  // Mẫu xe
    private int year;      // Năm sản xuất
    
    // Constructor của lớp Car
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Phương thức để hiển thị thông tin của xe
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    // Phương thức để kiểm tra xem xe có đạt tuổi (age) được chỉ định hay không
    public boolean isOlderThan(int age) {
        int currentYear = java.time.Year.now().getValue();
        return (currentYear - year) > age;
    }
}
