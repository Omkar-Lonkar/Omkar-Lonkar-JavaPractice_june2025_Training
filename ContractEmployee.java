public class ContractEmployee extends Employee{
    float numberOfHours;
    float hourlyWage;
    float oneKHrBonus;

        ContractEmployee(){
        System.out.println("Contract Employee");
    }

    public ContractEmployee(int id, String name, float hourlyWage, float numberOfHours) {
        super(id, name);
        this.hourlyWage = hourlyWage;
        this.numberOfHours = numberOfHours;
    }

    @Override
    void calculateSalary(){
        salary = (numberOfHours * hourlyWage);
        if(numberOfHours>1000)
        {
            salary = salary + 35000;
        }
    }


    void display(){
        super.display();
        System.out.println("Hourly wage: " + hourlyWage);
        System.out.println("Number of Hours: " + numberOfHours);
    }
}