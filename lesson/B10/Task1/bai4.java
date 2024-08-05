public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Số đĩa
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B, C là các cọc
    }

    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return; // Điểm dừng
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod); // Di chuyển n-1 đĩa từ from_rod đến aux_rod
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod); // Di chuyển n-1 đĩa từ aux_rod đến to_rod
    }
}
