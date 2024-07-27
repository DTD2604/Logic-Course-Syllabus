// Lớp Shape là lớp cha
public class Shape {
    // Thuộc tính protected
    protected String color;
    
    // Constructor
    public Shape(String color) {
        this.color = color;
    }
    
    // Phương thức công khai
    public String getColor() {
        return color;
    }
    
    // Phương thức abstract để tính diện tích (mẫu cho các lớp con)
    public double getArea() {
        return 0.0;
    }
}

// Lớp Circle kế thừa từ lớp Shape
public class Circle extends Shape {
    private double radius;
    
    // Constructor
    public Circle(String color, double radius) {
        super(color); // Gọi constructor của lớp cha
        this.radius = radius;
    }
    
    // Override phương thức getArea() để tính diện tích của hình tròn
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
