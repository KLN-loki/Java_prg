/**
1) a) Implement the following programs using command line arguments and Scanner class
 ii) To find the perimeter and area of a circle given a value of radius.
  */

import java.util.Scanner;

public class PeriAndAreaSC {
    public static void main(String[] args) {
        double r;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the radius : ");
            r = s.nextDouble();
        }
        System.out.println("Area : " + 3.14*r*r);
        System.out.println("Perimeter : " + 2*3.14*r);
    }
}