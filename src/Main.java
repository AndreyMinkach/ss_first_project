import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees= new LinkedList<>();

        ContractEmployee contractEmployee = new ContractEmployee("Dron1", 9, 10, "1", "a0000");
        ContractEmployee contractEmployee1 = new ContractEmployee("Dron2", 10, 11,"2", "a0001");
        ContractEmployee contractEmployee2 = new ContractEmployee("Dron3", 11, 13,"3", "a0002");

        SalariedEmployee salariedEmployee = new SalariedEmployee("Dron4", 100, "4", "b0000");
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Dron5", 150, "4", "b0000");

        employees.add(contractEmployee);
        employees.add(contractEmployee1);
        employees.add(contractEmployee2);
        employees.add(salariedEmployee);
        employees.add(salariedEmployee2);

        for (Employee employee: employees) {
            System.out.println(employee.toString());
        }
    }
}
