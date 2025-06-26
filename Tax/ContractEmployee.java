public class ContractEmployee extends Employee implements IncomeTax, GST {
    float numberOfHours;
    float hourlyWage;
    float oneKHrBonus;

    ContractEmployee() {
        System.out.println("Contract Employee");
    }

    public ContractEmployee(int id, String name, float hourlyWage, float numberOfHours) {
        super(id, name);
        this.hourlyWage = hourlyWage;
        this.numberOfHours = numberOfHours;
    }

    @Override
    void calculateSalary() {
        salary = (numberOfHours * hourlyWage);
        if (numberOfHours > 1000) {
            salary = salary + 35000;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(numberOfHours);
        result = prime * result + Float.floatToIntBits(hourlyWage);
        result = prime * result + Float.floatToIntBits(oneKHrBonus);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContractEmployee other = (ContractEmployee) obj;
        if (Float.floatToIntBits(numberOfHours) != Float.floatToIntBits(other.numberOfHours))
            return false;
        if (Float.floatToIntBits(hourlyWage) != Float.floatToIntBits(other.hourlyWage))
            return false;
        if (Float.floatToIntBits(oneKHrBonus) != Float.floatToIntBits(other.oneKHrBonus))
            return false;
        return true;
    }

    @Override
    public void payTax() {
        System.out.println("Paying the tax to the govt.");
    }

    @Override
    public void payGST() {
        System.out.println("Paying GST");
    }

    void display() {
        super.display();
        toString();
        payGST();
        payTax();
    }

    public String toString() {
        return "ContractEmployee [numberOfHours=" + numberOfHours + ", hourlyWage=" + hourlyWage  + "]";
    }
}