import java.util.Scanner;
public class StrRevArrBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter a number to search in the array: ");
        int searchNumber = scanner.nextInt();
        int searchIndex = binarySearch(sortedArray, searchNumber);

        if (searchIndex != -1) {
            System.out.println("Number found at index: " + searchIndex);
        } else {
            System.out.println("Number not found in the array.");
        }
        scanner.close();
    }
    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
    private static int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid; 
            } else if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; 
    }
}
