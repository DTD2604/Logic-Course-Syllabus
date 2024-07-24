package Chuoi_va_Thao_tac_chuoi;

/* a. Phương thức toLowerCase() và toUpperCase():

+ Chuyển đổi chuỗi thành chữ thường hoặc chữ hoa.
+ String toLowerCase()
+ String toUpperCase()

b. Phương thức trim():

+ Loại bỏ khoảng trắng ở đầu và cuối chuỗi.
+ String trim()

c. Phương thức replace():

+ Thay thế ký tự hoặc chuỗi con.
+ String replace(char oldChar, char newChar)

- Ví dụ: Sử dụng các phương thức trên với các chuỗi khác nhau.
*/ 

public class Bai_4 {
    public static void main(String[] args) {
        String str = " Hello, World! ";
        
        System.out.println("Chuyển thành chữ thường: " + str.toLowerCase());
        System.out.println("Chuyển thành chữ hoa: " + str.toUpperCase());
        System.out.println("Loại bỏ khoảng trắng: " + str.trim());
        System.out.println("Thay thế 'o' bằng 'a': " + str.replace('o', 'a'));
    }
}
