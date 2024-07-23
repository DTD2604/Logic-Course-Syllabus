public class EmployeeSalary {

    public static void main(String[] args) {
        // Khai báo biến cho thông tin lương
        double baseSalary = 3000.0;
        int overtimeHours = 10;
        double overtimeRate = 20.0;

        // Tính tổng lương làm thêm và tổng lương
        double overtimePay = overtimeHours * overtimeRate;
        double totalSalary = baseSalary + overtimePay;

        // In ra kết quả
        System.out.println("Lương cơ bản: $" + baseSalary);
        System.out.println("Giờ làm thêm: " + overtimeHours);
        System.out.println("Tiền lương làm thêm: $" + overtimePay);
        System.out.println("Tổng lương: $" + totalSalary);
    }
}
