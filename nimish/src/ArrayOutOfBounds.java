public class ArrayOutOfBounds {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Try to access an element at an index that is out of bounds
        try {
            int index = 10; // Out of bounds index
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index. Index is out of bounds.");
        }
    }
}
