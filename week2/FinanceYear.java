/**d) Write a program that accepts an „m x n‟ double dimension array, where „m‟ represents
 financial years and „n‟ represents Ids of the items sold. Each element in the array represents
 number of items sold in a particular year. Identify the year and id of the item which has
 more demand.*/

import java.util.Scanner;

public class FinanceYear {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of financial years : ");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            int fy[][] = new int[n][2];
            for (int i = 0; i < n; i++){
                System.out.println("Enter the financial year : ");
                fy[i][0] = s.nextInt();
                System.out.println("Enter the items sold : ");
                fy[i][1] = s.nextInt();
            }
            System.out.println("Financial year : demand");
            for (int i = 0; i < n; i++){
                System.out.println(fy[i][0] + "             " + fy[i][1]);
            }
            int max = 0;
            int flag = 0;
            for (int i = 0; i < n; i++){
                if (fy[i][1] > max){
                    max = fy[i][1];
                    flag = i;
                }
            }
            System.out.println(fy[flag][0] + " is the highest demand having " + max + " sold.");
        }
    }
}
