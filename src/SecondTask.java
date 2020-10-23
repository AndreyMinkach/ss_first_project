import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static boolean containsOurNumberOtherNumber(double ourNumber, String whatToFind){
        return String.valueOf(ourNumber*ourNumber).contains(whatToFind);
    }

    public static String reverseString(double ourNumber) {
        return new StringBuilder(String.valueOf(ourNumber)).reverse().toString();
    }

    public static String swapFirstAndLastElements(double ourNumber) {
        String strOurNumber = String.valueOf(ourNumber);
        char ch[] = strOurNumber.toCharArray();
        char tempElement = ch[0];
        ch[0] = ch[strOurNumber.length() - 1];
        ch[strOurNumber.length() - 1] = tempElement;
        return String.valueOf(ch);
    }

    private static String addOneToOurNumber(double ourNumber) {
        String strOurNumber = String.valueOf(ourNumber);
        return "1" + strOurNumber + "1";
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter natural numbers: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ourNumber = Double.parseDouble(br.readLine());
        
        System.out.println("1) " + containsOurNumberOtherNumber(ourNumber, "3"));
        System.out.println("2) " + reverseString(ourNumber));
        System.out.println("3) " + swapFirstAndLastElements(ourNumber));
        System.out.println("4) " + addOneToOurNumber(ourNumber));
    }
}
