import java.util.Random;

class Exercise8 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(20);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("nb" + (i + 1) + ": " + numbers[i]);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("La somme est de : " + sum);
    }
}
