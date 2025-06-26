import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        // PermanentEmployee permanentEmployee = new PermanentEmployee();

        // permanentEmployee.id = 111;
        // permanentEmployee.name = "John";
        // permanentEmployee.basicSalary = 50000.0f;

        // permanentEmployee.calculateSalary();
        // permanentEmployee.display();
        // PermanentEmployee permanentEmployee = new PermanentEmployee(111, "John",
        // 500000f);
        // permanentEmployee.calculateSalary();
        // permanentEmployee.display();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Employees: ");

        Employee[] employees = new Employee[Integer.parseInt(sc.nextLine())];

        for (int i = 0; i < employees.length; i++) {

            System.out.println("Enter Employee type: Permanent Employee=0  Contract Employee=1 ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 0:
                    System.out.println("Enter Employee id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Employee name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Employee basic salary: ");
                    float basicSalary = Float.parseFloat(sc.nextLine());

                    (employees[i] = new PermanentEmployee(id, name, basicSalary)).calculateSalary();
                    break;

                case 1:
                    System.out.println("Enter Employee id: ");
                    int ConEmployeeId = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Employee name: ");
                    String ConEmployeeName = sc.nextLine();
                    System.out.println("Enter Employee hourly wage:");
                    float hourlyWage = Float.parseFloat(sc.nextLine());
                    System.out.println("Enter Employee hours worked:");
                    float hoursWorked = Float.parseFloat(sc.nextLine());

                    (employees[i] = new ContractEmployee(ConEmployeeId, ConEmployeeName, hourlyWage, hoursWorked))
                            .calculateSalary();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        System.out.println("---------Printing Details---------");
        // UpRaise upraise = new UpRaise();
        for (Employee employee : employees) {
            System.out.println(employee);
            employee.display();
            Object obj = employee;
            System.out.println(employee.equals(obj));
            System.out.println(" ");
            
            
        //     // upraise.salaryUpraise(employee);
        //     upraise.salaryUpraiseByType(employee);
        }
        sc.close();
    }
    // ContractEmployee contractEmployee = new ContractEmployee();
    // contractEmployee.calculateSalary();
    // contractEmployee.display();
}