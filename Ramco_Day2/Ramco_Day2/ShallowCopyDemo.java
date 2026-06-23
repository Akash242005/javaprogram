 class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ShallowCopyDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Ganapathi");

        // Shallow Copy
        Student s2 = s1;

        s2.name = "Kumar";

        System.out.println("Original Name: " + s1.name);
        System.out.println("Copied Name: " + s2.name);
    }
}
