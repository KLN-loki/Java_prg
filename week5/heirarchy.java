/**
 * b) Create an inheritance hierarchy of Figure_3D, Cylinder, Cone, Sphere etc. In the base
class provides methods that are common to all Figure_3Ds and override these in the
derived classes to perform different behaviors, depending on the specific type of
Figure_3D. Create an array of Figure_3D, fill it with different specific types of
Figure_3Ds and call your base class methods**/

package week5;

import java.util.*;

class Figure_3D {
    void area() {
    }

    void volume() {
    }
}

class Cylinder extends Figure_3D {
    double radious;
    double height;

    Cylinder(double radious, double height) {
        super();
        this.radious = radious;
        this.height = height;
    }

    void area() {
        System.out.println("The area of cylinder is :" + (2 * Math.PI * radious * (radious + height)));
    }

    void volume() {
        System.out.println("The volume of cylinder is :" + (Math.PI * radious * radious * height));
    }
}

class Cone extends Figure_3D {
    double radious;
    double height;

    Cone(double radious, double height) {
        super();
        this.radious = radious;
        this.height = height;
    }

    void area() {
        System.out.println("The area of cone is:"
                + (Math.PI * radious * (radious + Math.sqrt((radious * radious + height * height)))));
    }

    void volume() {
        System.out.println("The volume of cone is :" + (Math.PI * radious * radious * height / 3));
    }
}

class Sphere extends Figure_3D {
    double radious;

    Sphere(double radious) {
        super();
        this.radious = radious;
    }

    void area() {
        System.out.println("The area of sphere is :" + (4 * Math.PI * radious * radious));
    }

    void volume() {
        System.out.println("The volume of sphere is:" + (4 / 3 * Math.PI * radious * radious * radious));
    }
}

class week6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figure_3D f[] = new Figure_3D[3];
        System.out.println("Enter dimensions of Cylinder ");
        System.out.print("Height :");
        double height = sc.nextDouble();
        System.out.print("Radious :");
        double radious = sc.nextDouble();
        f[0] = new Cylinder(radious, height);
        f[0].area();
        f[0].volume();
        System.out.println("Enter dimensions of Cone ");
        System.out.print("Height :");
        height = sc.nextDouble();
        System.out.print("Radious :");
        radious = sc.nextDouble();
        f[1] = new Cylinder(radious, height);
        f[1].area();
        f[1].volume();
        System.out.println("Enter dimensions of Sphere ");
        System.out.print("Radious :");
        radious = sc.nextDouble();
        f[2] = new Cylinder(radious, height);
        f[2].area();
        f[2].volume();
        sc.close();
    }
}
