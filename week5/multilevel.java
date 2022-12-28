/**
 * 5) a) Create a multilevel inheritance for classes vehicle, brand and cost. The vehicle class
determines the type of vehicle which is inherited by the class brand which determines the
brand of the vehicle. Brand class is inherited by cost class, which tells about the cost of
the vehicle. Create another class which calls the constructor of cost class and method that
displays the total vehicle information from the attributes available in the super classes.*/
 
package week5;

import java.util.*;

class Vehicle {
    String vehicle_name;

    Vehicle(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }
}

class Brand extends Vehicle {
    String brand_name;

    Brand(String vehicle_name, String brand_name) {
        super(vehicle_name);
        this.brand_name = brand_name;
    }
}

class Cost extends Brand {
    double price;

    Cost(String vehicle_name, String brand_name, double price) {
        super(vehicle_name, brand_name);
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Vehicle :" + vehicle_name);
        System.out.println("Brand :" + brand_name);
        System.out.println("Cost :" + price);
    }
}

class multilevel {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Vehicle type :");
            String vehicle_name = sc.nextLine();
            System.out.print("Enter brand name:");
            String brand_name = sc.nextLine();
            System.out.print("Enter cost of vehicle:");
            double price = sc.nextDouble();
            Cost c = new Cost(vehicle_name, brand_name, price);
            c.displayInfo();
        }
        // System.out.println("press 1 to Stop\n2 to continue : ");
        // Scanner s = new Scanner(System.in);
        // n = s.nextInt();
    }
}