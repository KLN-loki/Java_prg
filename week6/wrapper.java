package week6;

import java.util.Scanner;
/*
b) Write a program that accepts values of different data types and convert them to
corresponding wrapper classes and display using the vector
 */
import java.util.Vector;

public class wrapper {
    public static void main(String[] args) {
        int x;
        float y;
        double z;
        char a;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a integer : ");
            x = s.nextInt();
            System.out.println("Enter a Floating point : ");
            y = s.nextFloat();
            System.out.println("Enter a Double : ");
            z = s.nextDouble();
            System.out.println("Enter a character : ");
            a = s.next().charAt(0);
        }
        Integer i = Integer.valueOf(x);
        Float f = Float.valueOf(y);
        Double d = Double.valueOf(z);
        Character c = Character.valueOf(a);

        Vector<Object> v = new Vector<>();
        v.add(i);
        v.add(f);
        v.add(d);
        v.add(c);
        for (int k = 0; k < v.size(); k++) {
            System.out.println(v.get(k));
        }
    }
}
