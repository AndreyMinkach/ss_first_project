public class SalariedEmployee extends Employee implements Calculator{
    private String socialSecurityNumber;

    public SalariedEmployee(String name, double fixedPaid, String employeeId, String socialSecurityNumber) {
        super(name, Calculator.calculatePay(fixedPaid), employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
