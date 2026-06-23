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
        Student s2 = new Student(s1.age, s1.name);
        System.out.println(s2.name+" "+s2.age);
        s2.name = "GAN";
        System.out.println(s1.name+" "+s2.age);
    }
}


//TEST CASE 1 : 
//  INPUT : 6
//         100 3 4 200 1 2
// Output : 4

// TEST CASE 2 :
// INPUT : 5
//         1 2 4 5 6
// OUTPUT : 3

// TEST CASE 3 : 
// INPUT : 5
//         1 3 5 10 8
//OUTPUT : 1