public class ProductManagement {

    public static void main(String[] args) {
        // Khai báo biến cho thông tin sản phẩm
        String productName = "Laptop";
        double productPrice = 1500.0;
        int productQuantity = 3;

        // Tính tổng giá trị của các sản phẩm
        double totalValue = productPrice * productQuantity;

        // In ra thông tin sản phẩm
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá mỗi sản phẩm: $" + productPrice);
        System.out.println("Số lượng: " + productQuantity);
        System.out.println("Tổng giá trị: $" + totalValue);
    }
}
