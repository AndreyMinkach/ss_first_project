import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdTask {
    public static double getListSum(double [] list){
        double sum = 0;
        for (Double d : list)
            sum += d;
        return  sum;
    }

    public static double getCircleArea(double radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    public static double getCirclePerimeter(double radius) {
        return 2 * radius * Math.PI;
    }

    private static void showCirclePerimeterAndArea(BufferedReader br) throws IOException {
        System.out.println("Enter circle radius: \n");
        double circleRadius = Double.parseDouble(br.readLine());
        System.out.printf("Circle perimeter = %.2f\n", getCirclePerimeter(circleRadius));
        System.out.printf("Circle area = %.2f\n", getCircleArea(circleRadius));
    }

    public static void showUserInfo(BufferedReader br) throws IOException {
        System.out.print("What is your name?\n");
        String userName = br.readLine();
        System.out.printf("Where are you live %s?\n", userName);
        String userAddress = br.readLine();
        System.out.printf("Your name is %s and you live in %s.\n", userName, userAddress);
    }

    public static void showUnitCountEachCall(BufferedReader br) throws IOException {
        System.out.print("Enter units count for each of the three countries\nIn one line!: ");
        String[] units = br.readLine().split(" ");
        System.out.println("Enter the call duration in minutes\nIn one line!: ");
        String[] duration = br.readLine().split(" ");

        double[] unitCountAllCall = new double[3];
        for (int i = 0; i < units.length; i++) {
            unitCountAllCall[i] = Double.parseDouble(units[i]) * Double.parseDouble(duration[i]);
        }

        System.out.printf("General sum of units: %.2f\n", getListSum(unitCountAllCall));
        for (int i = 0; i < units.length; i++) {
            System.out.printf("%.2f units per %s for user %d\n", unitCountAllCall[i], duration[i], i + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        showCirclePerimeterAndArea(br);

        showUserInfo(br);

        showUnitCountEachCall(br);

    }
}
