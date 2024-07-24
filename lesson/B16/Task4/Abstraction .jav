// Lớp abstract Shape định nghĩa phương thức getArea()
public abstract class Shape {
    // Phương thức abstract không có phần thân
    public abstract double getArea();
}

// Lớp Circle kế thừa từ lớp Shape và cài đặt phương thức getArea()
public class Circle extends Shape {
    private double radius;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Override phương thức getArea() để tính diện tích của hình tròn
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
