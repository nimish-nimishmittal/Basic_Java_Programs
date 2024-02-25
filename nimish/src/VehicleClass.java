class Vehicle {
    private String make;
    private String model;
    private int yearOfManufacture;

    public Vehicle(String make, String model, int yearOfManufacture) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    private int seatingCapacity;

    public Car(String make, String model, int yearOfManufacture, int numberOfDoors, int seatingCapacity) {
        super(make, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Car Details:");
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

class Motorcycle extends Vehicle {
    private int engineCapacity;
    private String type;

    public Motorcycle(String make, String model, int yearOfManufacture, int engineCapacity, String type) {
        super(make, model, yearOfManufacture);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Motorcycle Details:");
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Type: " + type);
    }
}

public class VehicleClass {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4, 5);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2021, 1800, "Cruiser");

        car.displayDetails();
        System.out.println();
        motorcycle.displayDetails();
    }
}

