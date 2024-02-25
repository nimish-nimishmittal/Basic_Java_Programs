import java.util.Arrays;
import java.util.Scanner;
public class KthLargeSmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();
        int kthLargest = findKthLargest(array, k);
        int kthSmallest = findKthSmallest(array, k);
        System.out.println("Kth Largest Number: " + kthLargest);
        System.out.println("Kth Smallest Number: " + kthSmallest);
        scanner.close();
    }
    private static int findKthLargest(int[] array, int k) {
        Arrays.sort(array);
        return array[array.length - k];
    }
    private static int findKthSmallest(int[] array, int k) {
        Arrays.sort(array);
        return array[k - 1];
    }
}
