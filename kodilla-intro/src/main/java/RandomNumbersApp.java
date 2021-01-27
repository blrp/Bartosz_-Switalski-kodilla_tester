import java.util.Random;

public class RandomNumbersApp {
    public static void main(String[] args) {
        Random random =new Random ();
        int result = 0;
        int randomNumber = random.nextInt(31);
        int sum =0;
        int min =30;
        int max =0;
        while (sum <= 5000) {
            int temp =random.nextInt(31);
            sum = sum + temp;
            result++;
            System.out.println(temp + "+" + "=" + sum );
            if (temp < min) {
                min = temp;
                System.out.println("minimalna wylosowana to " + "" + min);

            }
            if (temp > max) {
                max = temp;
                System.out.println("maksymalna wylosowana to" + " "+ max);
            }
        }
        System.out.println(result);
    }
}
