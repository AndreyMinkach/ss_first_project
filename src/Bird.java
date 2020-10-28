public abstract class Bird {
    private String species;
    private Features features;
    private double speed;
    private final Wings wings = new Wings();

    public Bird(String species, Features features, double runningSpeed) {
        this.species = species;
        this.features = features;
        this.speed = runningSpeed;
    }

    public void layEggs(){
        System.out.println("Lay eggs");
    };

    public abstract void fly();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", features=" + features +
                ", speed=" + speed +
                '}';
    }
}
