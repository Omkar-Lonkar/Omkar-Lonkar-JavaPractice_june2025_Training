public class PermanentEmployee extends Employee implements IncomeTax, ProvidentFund{
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
     public void payTax() {
        System.out.println("Paying the tax to the govt.");
    }
    public void openAccount(){
        System.out.println("Opening a PF account");
    }
    public void depositAmount(){
        System.out.println("Depositing the amount in PF account " + Employer_Contribution);
    }
    public void withdraw(){
        System.out.println("Withdrawing the amount from PF account " );
    }

    public PermanentEmployee(int id, String name, float basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }
   

    void display(){ 
        super.display();
        toString();
        payTax();
        openAccount();
        depositAmount();
        withdraw();        
    }


    @Override
    public String toString() {
        return "PermanentEmployee [basicSalary=" + basicSalary + ", hra=" + hra + ", da=" + da + "]";
    }


   
}