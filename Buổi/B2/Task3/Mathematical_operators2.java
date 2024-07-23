// Tính lãi suất hàng năm
public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000.0; // Số tiền gốc
        double rate = 5.0; // Lãi suất phần trăm mỗi năm
        int time = 3; // Thời gian gửi tiền (năm)

        double interest = (principal * rate * time) / 100;

        System.out.println("Số tiền gốc: $" + principal);
        System.out.println("Lãi suất: " + rate + "%");
        System.out.println("Thời gian: " + time + " năm");
        System.out.println("Tiền lãi: $" + interest);
    }
}
