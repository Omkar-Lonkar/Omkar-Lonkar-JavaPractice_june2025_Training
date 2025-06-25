public class PermanentEmployee extends Employee {
    float basicSalary;
    float hra;
    float da;

    @Override
    void calculateSalary(){     //overriding:  same function name and parameters as parent class
        hra = basicSalary * 0.12f;
        da = basicSalary * 0.1f;
        salary = basicSalary+hra+da;        
    }


    PermanentEmployee(){
         System.out.println("Permanent Employee");
    }
    

    public PermanentEmployee(int id, String name, float basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }


    void display(){ 
        super.display();
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
    }
}