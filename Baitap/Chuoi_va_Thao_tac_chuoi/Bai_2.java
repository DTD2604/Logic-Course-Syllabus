package Chuoi_va_Thao_tac_chuoi;

/* a. Phương thức length():

+ Trả về độ dài của chuỗi.
+ int length()

b. Phương thức charAt():

+ Lấy ký tự tại một vị trí cụ thể.
+ char charAt(int index)

- Phương thức substring():

+ Lấy một phần của chuỗi.
+ String substring(int beginIndex, int endIndex)

c. Phương thức indexOf() và lastIndexOf():

+ Tìm vị trí đầu tiên và cuối cùng của một ký tự hoặc chuỗi con.
+ int indexOf(String str)
+ int lastIndexOf(String str)

- Ví dụ: Sử dụng các phương thức trên với các chuỗi khác nhau.

*/ 

public class Bai_2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        System.out.println("Độ dài của chuỗi: " + str.length());
        System.out.println("Ký tự tại vị trí 1: " + str.charAt(1));
        System.out.println("Chuỗi con từ vị trí 0 đến 5: " + str.substring(0, 5));
        System.out.println("Vị trí đầu tiên của 'o': " + str.indexOf('o'));
        System.out.println("Vị trí cuối cùng của 'o': " + str.lastIndexOf('o'));
    }
}

