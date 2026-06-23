 class Student {

    Student() {
        this("Unknown"); 
    }

    Student(String name) {
        System.out.println("Student Name: " + name);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {

        Student s1 = new Student();           
        Student s2 = new Student("Ganapathi"); 
    }
}
