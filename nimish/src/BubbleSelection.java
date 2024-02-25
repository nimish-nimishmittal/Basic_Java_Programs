import java.util.Arrays;
import java.util.Scanner;
public class BubbleSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Select Sorting Algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                bubbleSort(array);
                System.out.println("Array after Bubble Sort: " + Arrays.toString(array));
                break;
            case 2:
                selectionSort(array);
                System.out.println("Array after Selection Sort: " + Arrays.toString(array));
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        scanner.close();
    }
    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    private static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
