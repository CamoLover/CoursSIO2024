import java.util.Random;
import java.util.stream.IntStream;

class Exercise9 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(20);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("nb" + (i + 1) + ": " + numbers[i]);
        }

        int toSearch = rand.nextInt(20);

        if (IntStream.of(numbers).anyMatch(i -> i == toSearch)) {
            System.out.println(toSearch + " Est dans la liste.");
        } else {
            System.out.println(toSearch + " N'ets pas dans la liste");
        }
    }
}
