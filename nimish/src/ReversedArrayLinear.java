import java.util.Scanner;

public class ReversedArrayLinear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int start = 0, end = size - 1; start < end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }

        System.out.println("Reversed Array:");

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        int searchIndex = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                searchIndex = i;
                break;
            }
        }

        if (searchIndex != -1) {
            System.out.println("Element found at index: " + searchIndex);
        } else {
            System.out.println("Element not found in the reversed array.");
        }

        scanner.close();
    }
}

