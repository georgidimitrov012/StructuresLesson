import java.util.Scanner;

public class OddEvenArray {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);

        System.out.println("Enter the amount of the array:");

        int size = keyboard.nextInt();
        int[] theArray = new int[size];
        System.out.println("Enter the values of the elements: ");

        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            theArray[i] = keyboard.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int num : theArray) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("The sum of the odd number is: " + oddSum);
        System.out.println("The sum of the even number is: " + evenSum);
    }
}
