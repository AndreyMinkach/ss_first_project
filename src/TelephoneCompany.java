import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TelephoneCompany extends BufferedReader {
    private String[] units;
    private String[] duration;
    private double[] unitCountAllCall = new double[3];


    public TelephoneCompany() {
        super(new InputStreamReader(System.in));
    }

    public String[] getUnits() {
        return units;
    }

    public void setUnits() throws IOException {
        System.out.print("Enter units count for each of the three countries\nIn one line!: ");
        this.units = super.readLine().split(" ");
    }

    public String[] getDuration() {
        return duration;
    }

    public void setDuration() throws IOException {
        System.out.println("Enter the call duration in minutes\nIn one line!: ");
        this.duration = super.readLine().split(" ");
    }

    public void setPhoneInfo() throws IOException {
        this.setUnits();
        this.setDuration();
        for (int i = 0; i < units.length; i++) {
            this.unitCountAllCall[i] = Double.parseDouble(units[i]) * Double.parseDouble(duration[i]);
        }

    }

    public void showUnitCountEachCall() {
        for (int i = 0; i < units.length; i++) {
            System.out.printf("%.2f units per %s for user %d\n", this.unitCountAllCall[i], duration[i], i + 1);
        }
    }

    public void showUnitCountAllCalls() {
        System.out.printf("General sum of units: %.2f\n", getListSum(this.unitCountAllCall));
    }

    public double getListSum(double[] list) {
        double sum = 0;
        for (Double d : list)
            sum += d;
        return sum;
    }
}
