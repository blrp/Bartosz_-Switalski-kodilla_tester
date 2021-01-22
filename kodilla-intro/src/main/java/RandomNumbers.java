import java.util.Random;
public class RandomNumbers {
    public static int maxNumber;
    public static int minNumber;

    private static int randomNumbers() {
        Random random = new Random();
        int number = 0;
        for(int i=number + number; i < 5001; i++ ) {
            int randomNumber = random.nextInt(31);
            number = randomNumber;
        }
        return number;
    }
    private static int maxValue() {
        int numbersRandom = randomNumbers();
        if (maxNumber<=numbersRandom) {
            maxNumber = numbersRandom;
        }
        return maxNumber;
    }
    private static int minValue() {
        int numbersRandom = randomNumbers();
        if (minNumber>numbersRandom) {
            minNumber = numbersRandom;
        }
        return minNumber;
    }
    public static void main(String[] args) {
        System.out.println(maxValue());
        System.out.println(minValue());
    }
}