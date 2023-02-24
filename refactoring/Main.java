package refactoring;

public class Main {

  public static void main(String[] args) {

    // Create some employeesa and set their salary and (if any) commision and bonus
    Employee e1 = new Employee(EmployeeType.ENGINEER);
    e1.setMonthlySalary(5000);

    Employee e2 = new Employee(EmployeeType.SALESMAN);
    e2.setMonthlySalary(6000);
    e2.setCommission(500);

    Employee e3 = new Employee(EmployeeType.MANAGER);
    e3.setMonthlySalary(7000);
    e3.setBonus(2000);

    // Time to put them in a stack
    Stack<Employee> employeeStack = new Stack<>();

    // Time to pay the employees
    employeeStack.push(e1);
    employeeStack.push(e2);
    employeeStack.push(e3);

    int stackSize = employeeStack.size();
    for (int i = 0; i < stackSize; i++)
    {
      Employee temp = employeeStack.pop();
      System.out.println("Paying " + temp.getType() + " amount of: " + temp.payAmount());
    }

    e1.setRetired(true);
    e2.setSingle(true);

    System.out.println("Special amount for e1 is " + e1.getSpecialAmount());
    System.out.println("Special amount for e2 is " + e2.getSpecialAmount());
    System.out.println("Special amount for e3 is " + e3.getSpecialAmount());


  }
}
