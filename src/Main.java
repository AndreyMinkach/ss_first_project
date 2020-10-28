import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student4 = new Student("andrii4", 2);
        Student student5 = new Student("zndrii5", 3);
        Student student1 = new Student("qndrii1", 1);
        Student student2 = new Student("jndrii2", 1);
        Student student3 = new Student("nndrii3", 2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Student.printStudents(students, 3);

        System.out.println("Sorted by course");
        students.sort(new StudentCourseComparator());
        System.out.println(students.toString());

        System.out.println("Sorted by name");
        students.sort(new StudentNameComparator());
        System.out.println(students.toString());
    }
}
