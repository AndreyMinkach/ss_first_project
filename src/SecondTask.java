import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task {
    double ourNumber;

    public Task(){
        this(12.3);
    }

    public Task(double ourNumber) {
        this.ourNumber = ourNumber;
    }

    public boolean containsOurNumberOtherNumber(String whatToFind) {
        return String.valueOf(this.ourNumber * this.ourNumber).contains(whatToFind);
    }

    public String reverseString() {
        return new StringBuilder(String.valueOf(this.ourNumber)).reverse().toString();
    }

    public String swapFirstAndLastElements() {
        String strOurNumber = String.valueOf(this.ourNumber);
        char ch[] = strOurNumber.toCharArray();
        char tempElement = ch[0];
        ch[0] = ch[strOurNumber.length() - 1];
        ch[strOurNumber.length() - 1] = tempElement;
        return String.valueOf(ch);
    }

    public String addOneToOurNumber() {
        String strOurNumber = String.valueOf(this.ourNumber);
        return "1" + strOurNumber + "1";
    }

    public void showTaskResults(){
        System.out.println("1) " + containsOurNumberOtherNumber("3"));
        System.out.println("2) " + reverseString());
        System.out.println("3) " + swapFirstAndLastElements());
        System.out.println("4) " + addOneToOurNumber());
    }

}

public class SecondTask {


    public static void main(String[] args) throws IOException {
        System.out.println("Enter natural numbers: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ourNumber = Double.parseDouble(br.readLine());
        Task ourTask = new Task(ourNumber);
        ourTask.showTaskResults();
    }
}
