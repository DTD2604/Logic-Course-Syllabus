// Định nghĩa lớp Person
public class Person {
    // Các thuộc tính của lớp Person
    private String name;
    private int age;
    
    // Constructor của lớp Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Phương thức để hiển thị thông tin của Person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
