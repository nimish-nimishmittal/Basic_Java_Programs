import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("<---------------------------------------------------->");
            System.out.println("Welcome to String Operations Program !!");
            System.out.println("<---------------------------------------------------->");
            System.out.println("1. Complete Strings in Java ");
            System.out.println("2. Add/Concatenate Two Strings in Java ");
            System.out.println("3. Find the Length of a String in Java ");
            System.out.println("4. Print a Given String multiple times using Java ");
            System.out.println("5. Exit the program ");
            System.out.println("<---------------------------------------------------->");

            System.out.println("Enter your choice : ");

            int choice = sc.nextInt();

            if(choice == 1){
            System.out.println("This funcionality will ask for some data from the user and create strings automatically and join them accordingly.");
            System.out.println("Enter your name : ");
            String name = sc.next();
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            System.out.println("Enter the City you live in : ");
            String address = sc.next();
            System.out.println("Enter your Student ID Card number : ");
            int idCard = sc.nextInt();
            System.out.println("Enter any one favourite hobby of your choice : ");
            String hobbies = sc.next();
            String finalOutput = "Hi ! My name is " + name + ". I am " + age + " years old. I live in " + address + ". My ID Card Number is " + idCard + ". My favourite hobby is " + hobbies + ". Thank You !!";
            System.out.println("Here is the Complete String Constructed using Java : ");
            System.out.println(finalOutput);
            }

            else if(choice == 2){
            System.out.println("This Functionality will help us Add or Concatenate any Two Random Strings");
            System.out.println("Enter the First String Word : ");
            String str1 = sc.next();
            System.out.println("Enter the Second String Word : ");
            String str2 = sc.next();
            String str3 = str1 + " " + str2;
            System.out.println("The Final Concatenated String is : ");
            System.out.println(str3);
            }

            else if(choice == 3){
            System.out.println("This Functionality will help us Find Out the Length of the String entered by the User");
            System.out.println("Enter the string of your choice whose length you want to find : ");
            String testString = sc.next();
            System.out.print("The Length of the string entered by you is : ");
            System.out.println(testString.length());
            }

            else if(choice == 4){
            System.out.println("This Functionality will help us Print a String Multiple Times");
            System.out.print("Enter the word you want to print multiple times : ");
            String nimishioString = sc.next();
            System.out.println("Enter the number of times you want to print the above given sentence : ");
            int times = sc.nextInt();
            for (int i = 1; i <= times; i++){
                System.out.println(nimishioString);
            }
            }

            else if(choice == 5){
            System.out.println("Exiting the program. GoodBye !!");
            break;
            }

            else {
            System.out.println("Sorry !! You Entered a wrong choice... Try again...");
            }

        } while(true);

        sc.close();
    }
}
