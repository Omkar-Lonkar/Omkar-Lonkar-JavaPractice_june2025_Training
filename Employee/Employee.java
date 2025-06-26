public class Employee {
    int id;
    String name;
    float salary;

    void display() {                             //if written "final" before acces specifiers then it can be inherited but can't be overridden, henced it becomes immutable
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
}
    Employee(){
        System.out.println("Employee");
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void calculateSalary(){
        
    }
}