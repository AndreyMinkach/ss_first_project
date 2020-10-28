import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Bird> birds = new LinkedList<>();

        Eagle eagle = new Eagle("Sea Eagle", Features.FAST, 100.0);
        Swallow swallow = new Swallow("Barn swallow", Features.DISTRIBUTION, 50.0);
        Penguin penguin = new Penguin("King Penguin", Features.SWIM, 7.0);
        Kiwi kiwi = new Kiwi("Brown kiwi", Features.SMALL, 1);

        birds.add(eagle);
        birds.add(swallow);
        birds.add(penguin);
        birds.add(kiwi);

        for (Bird bird: birds) {
            bird.fly();
            System.out.println(bird.toString());
        }

        }
}
