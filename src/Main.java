import java.util.*;

public class Main {
    public static Set union(Set set1, Set set2){
        Set temp_set = new HashSet<>(set1);
        for (Object setElement: set1) {
            temp_set.add(setElement);
        }
        for (Object setElement: set2) {
            temp_set.add(setElement);
        }
        return temp_set;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
        System.out.println(union(set1, set2).toString());

        Set<String> set3 = new HashSet<>();
        Set<String> set4 = new HashSet<>();
        set3.add("a");
        set3.add("b");
        set4.add("c");
        set4.add("d");
        System.out.println(union(set3, set4).toString());

        Map <String, String> personMap = new HashMap<>();
        personMap.put("Andrii0", "Dron0");
        personMap.put("Andrii1", "Dron1");
        personMap.put("Andrii2", "Dron2");
        personMap.put("Andrii3", "Dron3");
        personMap.put("Andrii4", "Dron4");
        personMap.put("Andrii5", "Dron5");
        personMap.put("Andrii6", "Dron6");
        personMap.put("Andrii7", "Dron7");
        personMap.put("Andrii0", "Dron8");
        personMap.put("Andrii9", "Dron9");
        System.out.println(personMap.toString());
        for (Map.Entry<String, String> person : personMap.entrySet()) {
            System.out.println("Key: " + person.getKey() + " Value: " + person.getValue());
        }
        String nameToDelete = "Andrii0";
        if (personMap.containsKey(nameToDelete)){
            personMap.remove(nameToDelete);
        }else{
            System.out.println("No such name");
        }
        System.out.println(personMap.toString());

    }
}
