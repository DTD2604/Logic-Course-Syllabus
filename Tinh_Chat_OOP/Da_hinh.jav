// Lớp Animal là lớp cha
public class Animal {
    // Phương thức makeSound() của lớp cha
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Lớp Dog kế thừa từ lớp Animal và override lại phương thức makeSound()
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Lớp Cat kế thừa từ lớp Animal và override lại phương thức makeSound()
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Lớp Main để kiểm tra đa hình
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
