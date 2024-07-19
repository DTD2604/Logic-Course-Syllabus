// Lớp Circle mô tả hình tròn
public class Circle {
    // Thuộc tính private
    private double radius;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Phương thức getter và setter cho radius
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }
    
    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
