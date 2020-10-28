public class FlyingBird extends Bird {

    public FlyingBird(String species, Features features, double flightSpeed) {
        super(species, features, flightSpeed);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
