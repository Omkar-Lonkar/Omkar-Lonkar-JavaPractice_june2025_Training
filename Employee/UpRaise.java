public class UpRaise {
    void salaryUpraise(Employee employee) {
        float bonus = (float) (0.02 * employee.salary);
        employee.salary = (float) (employee.salary + bonus);
        System.out.println("Bonus: " + bonus);
        System.out.println("Appraised Salary: " + employee.salary);

    }

    void salaryUpraiseByType(Employee employee) {
        if (employee instanceof PermanentEmployee) {
            float bonus = (float) (0.05 * ((PermanentEmployee) employee).basicSalary);
            float newBasicSalary = ((PermanentEmployee) employee).basicSalary + bonus;
            float hra = newBasicSalary * 0.12f;
            float da = newBasicSalary * 0.1f;
            float newSalary = newBasicSalary + hra + da;
            System.out.println("Bonus: " + bonus);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Appraised Salary: " + newSalary);
        } else if (employee instanceof ContractEmployee) {
            {
                if (((ContractEmployee) employee).numberOfHours > 1000) {
                    float increasedRate = (float) (0.1 * ((ContractEmployee) employee).hourlyWage)
                            + ((ContractEmployee) employee).hourlyWage;
                    float newSalary = increasedRate * ((ContractEmployee) employee).numberOfHours;
                    System.out.println("New Hourly wage: " + increasedRate);
                    System.out.println("New Salary: " + newSalary);
                } else {
                    System.out.println("No change as hours are less than 1000");
                }

            }
        }
    }
}