public class ContractEmployee extends Employee implements Calculator {
    private String federalTaxIdMember;
    private int employeeId;

    public ContractEmployee(String name, double hourlyPaid, int hoursWorked, String employeeId, String federalTaxIdMember) {
        super(name, Calculator.calculatePay(hourlyPaid, hoursWorked), employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
    }
}
