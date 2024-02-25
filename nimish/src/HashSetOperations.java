import java.util.HashSet;
import java.util.Scanner;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> uniqueIntegers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHashSet Operations Menu:");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Check for Element");
            System.out.println("4. Display HashSet");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addElement(uniqueIntegers, scanner);
                    break;
                case 2:
                    removeElement(uniqueIntegers, scanner);
                    break;
                case 3:
                    checkForElement(uniqueIntegers, scanner);
                    break;
                case 4:
                    displayHashSet(uniqueIntegers);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addElement(HashSet<Integer> set, Scanner scanner) {
        System.out.print("Enter an integer to add: ");
        int element = scanner.nextInt();
        set.add(element);
        System.out.println("Element added successfully.");
    }

    private static void removeElement(HashSet<Integer> set, Scanner scanner) {
        System.out.print("Enter an integer to remove: ");
        int element = scanner.nextInt();
        if (set.remove(element)) {
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("The specified element is not found in the HashSet.");
        }
    }

    private static void checkForElement(HashSet<Integer> set, Scanner scanner) {
        System.out.print("Enter an integer to check for: ");
        int element = scanner.nextInt();
        if (set.contains(element)) {
            System.out.println("The HashSet contains the specified element.");
        } else {
            System.out.println("The HashSet does not contain the specified element.");
        }
    }

    private static void displayHashSet(HashSet<Integer> set) {
        System.out.println("HashSet Elements: " + set);
    }
}

