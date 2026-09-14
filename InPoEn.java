import java.util.Scanner;

class Person {
    String name;
    void showName() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    String course;
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks: Woof Woof");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

class PersonEncaps {
    private String name;
    private int age;
    
    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
}

public class InPoEn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Inheritance");
            System.out.println("2. Polymorphism");
            System.out.println("3. Encapsulation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("\n--- INHERITANCE EXAMPLE ---");
                    Student s = new Student();
                    s.name = "John";
                    s.course = "BS Computer Science";
                    s.showName();
                    s.showDetails();
                    break;

                case 2:
                    System.out.println("\n--- POLYMORPHISM EXAMPLE ---");
                    Animal myAnimal = new Animal();
                    Animal myDog = new Dog();
                    Animal myCat = new Cat();
                    myAnimal.makeSound();
                    myDog.makeSound();
                    myCat.makeSound();
                    break;

                case 3:
                    System.out.println("\n--- ENCAPSULATION EXAMPLE ---");
                    PersonEncaps p = new PersonEncaps();
                    p.setName("Alice");
                    p.setAge(20);
                    System.out.println("Name: " + p.getName());
                    System.out.println("Age: " + p.getAge());
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 4);

        input.close();
    }
}