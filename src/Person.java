import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person extends BufferedReader {
    private String name;
    private String personAddress;

    public Person() {
        this("Name", "Address");
    }

    public Person(String name, String personAddress) {
        super(new InputStreamReader(System.in));
        this.name = name;
        this.personAddress = personAddress;
    }

    public String getName() {
        return name;
    }

    public void setName() throws IOException {
        System.out.print("What is your name?\n");
        this.name = super.readLine();
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress() throws IOException {
        System.out.printf("Where are you live %s?\n", this.name);
        this.personAddress = super.readLine();
    }

    public void setPersonInfo() throws IOException {
        this.setName();
        this.setPersonAddress();
    }

    public void showUserInfo() {
        System.out.printf("Your name is %s and you live in %s.\n", this.name, this.personAddress);
    }
}