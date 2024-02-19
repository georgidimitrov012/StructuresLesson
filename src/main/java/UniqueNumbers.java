import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumbers {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        int[] numbers = {1,2,3,4,2,1,2,3,4};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        for (int unique : uniqueNumbers) {
            System.out.println(unique);
        }
    }
}
