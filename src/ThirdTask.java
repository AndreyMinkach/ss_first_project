import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThirdTask {
    public static String getCircleArea(double radius) {
        return String.valueOf(Math.pow(radius, 2) * Math.PI);
    }

    public static String getCirclePerimeter(double radius) {
        return String.valueOf(2 * radius * Math.PI);
    }

    private static void showCirclePerimeterAndArea(BufferedReader br) throws IOException {
        System.out.println("Enter circle radius: ");
        double circleRadius = Double.parseDouble(br.readLine());
        System.out.println("1)\nCircle radius = " + getCirclePerimeter(circleRadius));
        System.out.println("Circle area = " + getCircleArea(circleRadius));
    }

    public static void showUserInfo(BufferedReader br) throws IOException {
        System.out.print("What is your name?\n");
        String userName = br.readLine();
        System.out.printf("Where are you live %s?\n", userName);
        String userAddress = br.readLine();
        System.out.printf("Your name is %s and you live in %s.\n", userName, userAddress);
    }

    public static void getUnitCountEachCall(BufferedReader br) throws IOException {
        System.out.print("Enter units count for each of the three countries: ");
        String[] units = br.readLine().split(" ");
        System.out.println(Arrays.toString(units));
        System.out.println("Enter the call duration in minutes: ");
        String[] duration = br.readLine().split(" ");

        double unitCountAllCall[] = new double[3];
        for (int i = 0; i < units.length; i++) {
            unitCountAllCall[i] = Double.parseDouble(units[i]) * Double.parseDouble(duration[i]);
        }
        double sum = 0;
        for (Double d : unitCountAllCall)
            sum += d;
        System.out.println("General sum of units: " + sum);
        for (int i = 0; i < units.length; i++) {
            System.out.printf("%.2f units per %s for user %d\n", unitCountAllCall[i], duration[i], i + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        showCirclePerimeterAndArea(br);

        showUserInfo(br);

        getUnitCountEachCall(br);

    }
}
