package Ham;

// + Khái niệm hàm quá tải.
// + Cách định nghĩa các hàm quá tải.

public class Bai_4 {
    // 1. Viết hai hàm printInfo, một hàm nhận vào một tham số kiểu String và một hàm nhận vào hai tham số kiểu String.

    public static void printInfo(String info) {
        System.out.println(info);
    }

    public static void printInfo(String info1, String info2) {
        System.out.println(info1 + " " + info2);
    }

    // 2. Viết hai hàm calculate, một hàm nhận vào hai tham số kiểu int và một hàm nhận vào hai tham số kiểu double.

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double x, double y) {
        return x + y;
    }

    // Bài Tập Về Nhà:
    
// 1. Viết hai hàm printDetails, một hàm nhận vào một tham số kiểu int và một hàm nhận vào hai tham số kiểu int.
    /*// Định nghĩa hàm printDetails với một tham số
    public static void printDetails(int age) {
        System.out.println("Tuổi của bạn là: " + age);
    }

    // Định nghĩa hàm printDetails với hai tham số
    public static void printDetails(int age, int year) {
        System.out.println("Tuổi của bạn là: " + age + ", Năm sinh của bạn là: " + year);
    }

    public static void main(String[] args) {
        // Gọi hai hàm printDetails
        printDetails(20);
        printDetails(19, 2005);
    }*/ 

// 2. Viết hai hàm compute, một hàm nhận vào ba tham số kiểu int và một hàm nhận vào ba tham số kiểu double.
    /*// Định nghĩa hàm compute với ba tham số int
    public static int compute(int a, int b, int c) {
        return a + b + c;
    }

    // Định nghĩa hàm compute với ba tham số double
    public static double compute(double a, double b, double c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        // Gọi hai hàm compute và in ra kết quả
        int sum = compute(1, 2, 3);
        double product = compute(1.0, 2.0, 3.0);
        System.out.println("Tổng là: " + sum);
        System.out.println("Tích là: " + product);
    }*/ 
}
