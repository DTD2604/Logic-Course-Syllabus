public class StudentGrades {

    public static void main(String[] args) {
        // Khai báo và khởi tạo các biến lưu trữ điểm của các môn học
        double mathGrade = 85.5;
        double physicsGrade = 78.0;
        double chemistryGrade = 92.0;

        // Tính tổng điểm của các môn học
        double totalGrades = mathGrade + physicsGrade + chemistryGrade;

        // Tính điểm trung bình
        double averageGrade = totalGrades / 3;

        // In ra kết quả
        System.out.println("Điểm Toán: " + mathGrade);
        System.out.println("Điểm Vật lý: " + physicsGrade);
        System.out.println("Điểm Hóa học: " + chemistryGrade);
        System.out.println("Tổng điểm: " + totalGrades);
        System.out.println("Điểm trung bình: " + averageGrade);

        // Sử dụng toán tử lấy dư để kiểm tra điểm có phải là số chẵn hay lẻ
        int roundedAverage = (int) averageGrade; // Làm tròn điểm trung bình để kiểm tra
        if (roundedAverage % 2 == 0) {
            System.out.println("Điểm trung bình là số chẵn");
        } else {
            System.out.println("Điểm trung bình là số lẻ");
        }
    }
}
