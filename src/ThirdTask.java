import java.io.IOException;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        Circle circle = new Circle();
        circle.setRadius();
        circle.showCirclePerimeterAndArea();

        Person person = new Person();
        person.setPersonInfo();
        person.showUserInfo();

        TelephoneCompany telephoneCompany = new TelephoneCompany();
        telephoneCompany.setPhoneInfo();
        telephoneCompany.showUnitCountEachCall();
        telephoneCompany.showUnitCountAllCalls();

    }
}
