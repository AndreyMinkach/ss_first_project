import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> myCollection = new ArrayList<>();
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(1, "Employee1");
        employeeMap.put(2, "Employee2");
        employeeMap.put(3, "Employee3");
        employeeMap.put(4, "Employee4");
        employeeMap.put(5, "Employee5");
        employeeMap.put(6, "Employee6");
        employeeMap.put(7, "Employee7");
        System.out.println(employeeMap.toString());

        System.out.println("Enter employees id");
        Integer employeeId = Integer.parseInt(br.readLine());
        if (employeeMap.containsKey(employeeId)) {
            System.out.println(employeeMap.get(employeeId));
        } else {
            System.out.println("Cant find employee with that id " + employeeId);
        }

        System.out.println("Enter employees name");
        String employeeName = br.readLine();
        if (employeeMap.containsValue(employeeName)) {
            System.out.println(getKey(employeeMap, employeeName));
        }else {
            System.out.println("Cant find employee with that name " + employeeName);
        }

    }
}
