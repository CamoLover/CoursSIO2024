import java.util.Random;
import java.util.Arrays;

class Exercise10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(20000);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("nb" + (i + 1) + ": " + numbers[i]);
        }
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.println(max + " est le plus gros");

    }
}
