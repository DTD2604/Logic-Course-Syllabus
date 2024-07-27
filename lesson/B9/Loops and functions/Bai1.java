// Viết chương trình tính diện tích và thể tích của hình cầu, biết bán kính của hình cầu.
import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập bán kính của hình cầu (r): ");
        double radius = scanner.nextDouble();
        
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        
        System.out.printf("Diện tích mặt cầu: %.2f\n", surfaceArea);
        System.out.printf("Thể tích của hình cầu: %.2f\n", volume);
    }
}