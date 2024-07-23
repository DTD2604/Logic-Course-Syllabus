public class DataTypesExample {

    public static void main(String[] args) {
        // Kiểu dữ liệu nguyên thủy (Primitive Data Types)
        byte byteValue = 127;
        short shortValue = 32000;
        int intValue = 100000;
        long longValue = 10000000000L;
        float floatValue = 10.5f;
        double doubleValue = 20.99;
        char charValue = 'A';
        boolean booleanValue = true;

        // Kiểu dữ liệu tham chiếu (Reference Data Types)
        String stringValue = "Hello, World!";
        int[] intArray = {1, 2, 3, 4, 5};
        Person person = new Person("John Doe", 30);

        // In ra giá trị của các biến
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);

        System.out.println("String Value: " + stringValue);
        System.out.print("Int Array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Person Name: " + person.name);
        System.out.println("Person Age: " + person.age);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
