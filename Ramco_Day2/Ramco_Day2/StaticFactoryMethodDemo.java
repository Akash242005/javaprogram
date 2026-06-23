 class Employee {

    
    private Employee() {
        System.out.println("Employee Object Created");
    }

    
    public static Employee createEmployee() {
        return new Employee();
    }
}

public class StaticFactoryMethodDemo {
    public static void main(String[] args) {

        Employee emp = Employee.createEmployee();

        System.out.println("Employee Created Successfully");
    }
}
