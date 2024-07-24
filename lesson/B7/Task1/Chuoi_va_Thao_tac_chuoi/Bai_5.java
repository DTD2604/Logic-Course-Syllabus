package Chuoi_va_Thao_tac_chuoi;

/* a. Phương thức split():

+ Chia nhỏ chuỗi thành mảng các chuỗi con.
+ String[] split(String regex)

b. Sử dụng StringBuilder để nối chuỗi:

+ Hiệu quả hơn khi nối nhiều chuỗi.
+ StringBuilder append(String str)

- Ví dụ: Chia nhỏ và nối chuỗi với các ví dụ khác nhau. */ 

public class Bai_5 {
    public static void main(String[] args) {
        String str = "Java,Python,C++,JavaScript";
        
        // Chia nhỏ chuỗi
        String[] languages = str.split(",");
        for (String language : languages) {
            System.out.println(language);
        }
        
        // Nối chuỗi bằng StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        
        System.out.println("Nối chuỗi bằng StringBuilder: " + sb.toString());
    }
}
