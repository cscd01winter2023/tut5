package refactoring;

/**
 * Represents an Employee
 */
public class Employee {
  private EmployeeType type;
  private double monthlySalary;
  private double commission;
  private double bonus;
  private boolean isSingle;
  private boolean isSeparated;
  private boolean isRetired;

  public Employee(EmployeeType type) {
    this.type = type;
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  public void setCommission(double commission) {
    this.commission = commission;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public EmployeeType getType() {
    return type;
  }

  public void setSingle(boolean single) {
    isSingle = single;
  }

  public void setSeparated(boolean separated) {
    isSeparated = separated;
  }

  public void setRetired(boolean retired) {
    isRetired = retired;
  }

  /**
   * This function calculates the pay amount based on the employee type
   *
   * @return The amount the employee should be paid
   */
  public double payAmount() {
    switch (this.type) {
      case ENGINEER:
        return this.monthlySalary;
      case SALESMAN:
        return this.monthlySalary + this.commission;
      case MANAGER:
        return this.monthlySalary + this.bonus;
      default:
        throw new RuntimeException("Incorrect Employee");
    }
  }

  private double singleAmount() {
    return 150.00;
  }

  private double separatedAmount(){
    return 250.00;
  }

  private double retiredAmount(){
    return 300.00;
  }

  private double normalPayAmount(){
    return 500.00;
  }

  /**
   * This function calculates a "special" value based on their status
   * (FYI: This is 100% made up and fictional - you do not need to understand it)
   *
   * @return Amount they should get
   */
  public double getSpecialAmount(){
    double result;
    if ( isSingle ) result = singleAmount();
    else {
      if ( isSeparated ) result = separatedAmount();
      else {
        if ( isRetired) result = retiredAmount();
        else result = normalPayAmount();
      }
    }
    return result;

  }
}
