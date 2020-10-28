public class NonflyingBird extends Bird {

    public NonflyingBird(String species, Features features, double runningSpeed) {
        super(species, features, runningSpeed);
    }

    @Override
    public void fly() {
        System.out.println("I cant fly :(");
    }
}
