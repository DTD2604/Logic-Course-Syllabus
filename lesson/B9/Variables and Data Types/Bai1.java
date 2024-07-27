// Viết chương trình nhập vào số lượng kWh điện tiêu thụ trong một tháng
import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng kWh điện tiêu thụ: ");
        double kWh = scanner.nextDouble();

        double thanhTien = 0;
        if (kWh <= 50) {
            thanhTien = kWh * 1678;
        } else if (kWh <= 100) {
            thanhTien = 50 * 1678 + (kWh - 50) * 1734;
        } else {
            thanhTien = 50 * 1678 + 50 * 1734 + (kWh - 100) * 2014;
        }

        double tongTien = thanhTien * 1.1;
        System.out.println("Tổng tiền điện phải trả: " + tongTien + " đồng");
    }
}
