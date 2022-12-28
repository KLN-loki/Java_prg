/**3) a) Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. The class should have a method that can
return the volume of the box. Create an object of the Box class and test the functionalities*/
import java.util.Scanner;

class sampleBox{
    double len, wid, hei;

    sampleBox(double l, double w, double h){
        len = l;
        wid = w;
        hei = h;
    }
    double volume(){
        return (len*wid*hei);
    }
}


public class Box {
    public static void main(String[] args) {
        double Blen, Bwid, Bhei;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the length : ");
            Blen = s.nextDouble();
            System.out.println("Enter the width : ");
            Bwid = s.nextDouble();
            System.out.println("Enter the height : ");
            Bhei = s.nextDouble();
        }
        sampleBox obj = new sampleBox(Blen, Bwid, Bhei);
        double volume = obj.volume();
        System.out.println("Volume of the box is : " + volume);
    }
    
}