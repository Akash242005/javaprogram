interface Animal {

    
    void sound();

   
    default void eat() {
        helper();
        System.out.println("Animal eats food");
    }

   
    static void sleep() {
        System.out.println("Animal is sleeping");
    }

    
    private void helper() {
        System.out.println("Private helper method");
    }
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();      
        d.eat();        
        Animal.sleep(); 
    }
} 
