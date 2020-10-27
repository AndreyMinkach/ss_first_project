import com.ss.first.Animal;
import com.ss.first.Cat;
import com.ss.first.Dog;
import com.ss.second.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Animal>animalList = new ArrayList<>();

        Cat cat = new Cat();
        Dog dog = new Dog();

        animalList.add(cat);
        animalList.add(dog);

        for (Animal animal : animalList) {
            animal.voice();
        }

        ArrayList<Person> personList = new ArrayList<>();

        Student student = new Student("Andrii");
        Teacher teacher = new Teacher("Not Andrii");
        Cleaner cleaner = new Cleaner("Hope not Andrii");

        personList.add(student);
        personList.add(teacher);
        personList.add(cleaner);

        for (Person person : personList) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
