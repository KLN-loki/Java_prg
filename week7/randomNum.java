package week7;

/*
 * 7) a) Write a program to generate a set of random numbers between two numbers x1 and x2,
and x1>0.
 */
import java.util.*;

class randomNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter lower limit greater than 0 : ");
            int x1 = sc.nextInt();
            if (x1 > 0){
                System.out.print("Enter upper limit: ");
                int x2 = sc.nextInt();
                System.out.print("Enter no. of random numbers to be generated: ");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print(x1 + (int) (Math.random() * (x2 - x1)) + " ");
                }
            }
            else System.out.println("Please Enter lower limit greater than 0.");
        }
    }
}
