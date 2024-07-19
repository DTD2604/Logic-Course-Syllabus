public class StudentManagement {

    public static void main(String[] args) {
        // Khai báo và khởi tạo các biến cho thông tin sinh viên
        String studentName = "Nguyễn Văn A";
        int studentAge = 20;
        double studentGPA = 3.75;
        boolean isEnrolled = true;

        // In ra thông tin của sinh viên
        System.out.println("Thông tin sinh viên:");
        System.out.println("Tên: " + studentName);
        System.out.println("Tuổi: " + studentAge);
        System.out.println("Điểm trung bình: " + studentGPA);
        System.out.println("Đang theo học: " + (isEnrolled ? "Có" : "Không"));

        // Thực hiện một số thao tác đơn giản
        // Tăng tuổi của sinh viên lên 1
        studentAge++;
        System.out.println("\nSau khi tăng tuổi:");
        System.out.println("Tuổi: " + studentAge);

        // Cập nhật điểm trung bình
        studentGPA = 3.85;
        System.out.println("Điểm trung bình mới: " + studentGPA);

        // Thay đổi trạng thái đăng ký học
        isEnrolled = false;
        System.out.println("Đang theo học: " + (isEnrolled ? "Có" : "Không"));
    }
}
