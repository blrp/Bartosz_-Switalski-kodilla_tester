import java.util.Random;

public class RandomNumbersApp {
    public static void main(String[] args) {
        RandomNumbers rN = new RandomNumbers();
        rN.randomNumbers();
       System.out.println(rN.getMax());
        System.out.println(rN.getMin());
    }

}
