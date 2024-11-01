import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Bubble sort
        int[] unsortedArray = { 10, 4,1, 5, 2, 3, 20 };
        int temp = 0;

        System.out.println("Bubble Sort");

        System.out.println("Before Sort");
        System.out.println(Arrays.toString(unsortedArray));

        for (int i =0; i < unsortedArray.length-1; i++) {
            for (int j =0; j < unsortedArray.length-1; j++) {
                if (unsortedArray[j] > unsortedArray[j+1]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sort");
        System.out.println(Arrays.toString(unsortedArray));
    }
}