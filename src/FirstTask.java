import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        double abc[] = {20.2, 30.3, 10.1};
        double xy[] = {10, 31};
        Arrays.sort(abc);
        Arrays.sort(xy);
        if (abc[0] <= xy[0] && abc[1] <= xy[1]) {
            System.out.println("You will pass");
        } else System.out.println("You shall not pass");
    }
}
