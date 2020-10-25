import com.javacourse.se.lesson14.MyArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

class TaskOne {
    public TaskOne() {
        this(20.2, 30.3, 10.1, 12, 31);
    }

    public TaskOne(double a, double b, double c, double x, double y) {
        double[] abc = {a, b, c};
        double[] xy = {x, y};
        Arrays.sort(abc);
        Arrays.sort(xy);
        if (abc[0] <= xy[0] && abc[1] <= xy[1]) {
            System.out.println("You will pass");
        } else System.out.println("You shall not pass");
    }
}

public class FirstTask {
    public static void main(String[] args) throws IOException {
        TaskOne firstTask = new TaskOne();

    }
}
