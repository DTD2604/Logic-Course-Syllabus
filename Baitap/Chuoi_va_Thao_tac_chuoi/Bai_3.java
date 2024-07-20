package Chuoi_va_Thao_tac_chuoi;

/* a. So sánh chuỗi:

+ Sử dụng phương thức equals() và compareTo().
+ boolean equals(Object anObject)
+ int compareTo(String anotherString)

b. Nối chuỗi:

+ Sử dụng toán tử + và phương thức concat().
+ String concat(String str)

Ví dụ: So sánh và nối chuỗi với các ví dụ khác nhau. */ 

public class Bai_3 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // So sánh chuỗi
        System.out.println("So sánh bằng equals: " + str1.equals(str2));
        System.out.println("So sánh bằng compareTo: " + str1.compareTo(str2));
        
        // Nối chuỗi
        String str3 = str1 + " " + str2;
        System.out.println("Nối chuỗi bằng +: " + str3);
        System.out.println("Nối chuỗi bằng concat: " + str1.concat(" ").concat(str2));
    }
}
