import java.util.Random;

public class Main2 {
    public static void main(String[] args) {

        int[] array = new int[5];


        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }


        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
