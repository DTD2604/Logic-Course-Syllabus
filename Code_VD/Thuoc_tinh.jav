// Lớp đơn giản Car
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
    
    // Phương thức getter cho thuộc tính brand
    public String getBrand() {
        return brand;
    }
    
    // Phương thức setter cho thuộc tính year
    public void setYear(int year) {
        this.year = year;
    }
}
