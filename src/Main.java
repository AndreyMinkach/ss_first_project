import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();
        ArrayList<Integer> newCollection = new ArrayList<>();
        Random random = new Random();

        ////////////// 1 ///////////////
        System.out.println("1");
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(40));
            if (myCollection.get(myCollection.size() - 1) > 5) {
                newCollection.add(myCollection.get(myCollection.size() - 1));
            }
        }
        System.out.println(newCollection.toString());

        ////////////// 2 ///////////////
        System.out.println("2");
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }

        ////////////// 3 ///////////////
        System.out.println("3");
        try {
            myCollection.add(2, 1);
            myCollection.add(8, -3);
            myCollection.add(5, -4 );
        }catch (IndexOutOfBoundsException e){
            System.err.println("Short array");
        }

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("position – %d, value of element – %d\n", i, myCollection.get(i));
        }

        ////////////// 4 ///////////////
        System.out.println("4");
        System.out.println(myCollection.toString());
        Collections.sort(myCollection);
        System.out.println(myCollection.toString());
    }
}
