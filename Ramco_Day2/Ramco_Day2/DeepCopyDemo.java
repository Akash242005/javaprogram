class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class DeepCopyDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Ganapathi");

        
        Student s2 = new Student(s1.name);

        s2.name = "Kumar";

        System.out.println("Original Name: " + s1.name);
        System.out.println("Copied Name: " + s2.name);
    }
}