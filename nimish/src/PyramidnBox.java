import java.util.Scanner;
public class PyramidnBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pattern:");
        System.out.println("a. Number Pyramid");
        System.out.println("b. Box of Stars");
        System.out.print("Enter your choice (a or b): ");
        char choice = scanner.next().charAt(0);
        switch (choice) {
            case 'a':
                printNumberPyramid();
                break;
            case 'b':
                printBoxOfStars();
                break;
            default:
                System.out.println("Invalid choice. Please enter 'a' or 'b'.");
        }
        scanner.close();
    }
    private static void printNumberPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    private static void printBoxOfStars() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
