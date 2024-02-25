import java.util.Scanner;
public class ArrayMenuDriven {
    public static void main(String[] args) {
        String[] array = new String[10];
        int size = 0; 
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Display Array");
            System.out.println("2. Add Element");
            System.out.println("3. Remove Element");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    displayArray(array, size);
                    break;
                case 2:
                    addElement(array, scanner, size);
                    size++;
                    break;
                case 3:
                    removeElement(array, scanner, size);
                    if (size > 0) {
                        size--;
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
    private static void displayArray(String[] array, int size) {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.print("Array Elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    private static void addElement(String[] array, Scanner scanner, int size) {
        if (size < array.length) {
            System.out.print("Enter a new element to add: ");
            String newElement = scanner.nextLine();
            array[size] = newElement;
            System.out.println("Element added successfully.");
        } else {
            System.out.println("Array is full. Cannot add more elements.");
        }
    }
    private static void removeElement(String[] array, Scanner scanner, int size) {
        if (size == 0) {
            System.out.println("Array is already empty. No elements to remove.");
        } else {
            System.out.print("Enter the element to remove: ");
            String elementToRemove = scanner.nextLine();
            int indexToRemove = -1;
            for (int i = 0; i < size; i++) {
                if (array[i].equals(elementToRemove)) {
                    indexToRemove = i;
                    break;
                }
            }
            if (indexToRemove != -1) {
                for (int i = indexToRemove; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
                System.out.println("Element removed successfully.");
            } else {
                System.out.println("The specified element is not found in the array.");
            }
        }
    }
}
