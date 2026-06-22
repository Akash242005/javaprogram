class Student{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student(12, "AKASH");
        Student s2 = s1;
        System.out.println(s2.name+" "+s2.age);
        s2.name = "GAN";
        System.out.println(s1.name+" "+s2.age);
    }
}
