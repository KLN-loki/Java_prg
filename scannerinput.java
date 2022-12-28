/**1) a) Implement the following programs using command line arguments and Scanner class
 i) Accept two strings from the user and print it on console with concatenation of “and”
 in the middle of the strings.
*/

import java.util.Scanner;
class scannerinput {
    public static void main(String[] args) {
        String str1, str2;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the String 1 : ");
            str1 = scan.nextLine();
            System.out.println("Enter the String 2 : ");
            str2 = scan.nextLine();
        }
        System.out.println(str1 + " and " + str2);
    }
}
