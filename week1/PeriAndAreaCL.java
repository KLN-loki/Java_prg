/**
1) a) Implement the following programs using command line arguments and Scanner class
 ii) To find the perimeter and area of a circle given a value of radius.
 */
public class PeriAndAreaCL {

    public static void main(String[] args) {
        double rad = Double.parseDouble(args[0]);
        System.out.println("Area of the circle is : " + 3.14*rad*rad);
        System.out.println("Perimeter of the circle is : " + 2*3.14*rad);
    }
}
