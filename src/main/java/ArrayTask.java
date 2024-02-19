public class ArrayTask {
    public static void main(String[] args) {
        int [] testArray = new int[20];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i * 5;
        }

        for (int i = 0; i < testArray.length; i++) {
            System.out.println("Елемент " + i + ": " + testArray[i]);
        }
    }
}
