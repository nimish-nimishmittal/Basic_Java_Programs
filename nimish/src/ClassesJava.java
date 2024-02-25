import java.util.Scanner;
class Person {
    private String name;
    private int age;
    private String address;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
public class ClassesJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Enter name: ");
        person.setName(scanner.nextLine());
        System.out.print("Enter age: ");
        person.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter address: ");
        person.setAddress(scanner.nextLine());
        System.out.println("\nPerson's Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        scanner.close();
    }
}

