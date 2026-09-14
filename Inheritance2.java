
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

public class Inheritance2 {
    public static void main(String[] args) {
        Student s = new Student();
        
        s.name = "John";
        s.course = "BS Computer Science";
        
        s.showName();
        s.showDetails();
    }
}