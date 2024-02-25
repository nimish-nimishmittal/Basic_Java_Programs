import java.util.Arrays;
public class NegOneSideArray {
    public static void main(String[] args) {
        int[] array = {2, -4, 7, -1, 8, -3, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        moveNegatives(array);
        System.out.println("Array after moving negatives: " + Arrays.toString(array));
    }
    private static void moveNegatives(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            while (left <= right && array[left] < 0) {
                left++;
            }
            while (left <= right && array[right] >= 0) {
                right--;
            }
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}

