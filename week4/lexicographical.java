import java.util.Scanner;

// a) Accept a String and a number „n‟ from user. Divide the given string into substrings
// each of size „n‟ and sort them lexicographically.
public class lexicographical {
    public static void main(String[] args) {
        int n;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of strings(n) : ");
            n = s.nextInt();
            String[] name = new String[n+1];
            for (int i = 0; i < name.length; i++) {
                name[i] = s.nextLine();
            }
            System.out.println("Before Sorting");
            for (int i = 0; i < name.length; i++) {
                System.out.println(name[i]);
            }
            for (int i = 0; i < name.length-1; ++i) {
                for (int j = i + 1; j < name.length; ++j) {
                    if (name[i].compareTo(name[j]) > 0) {
                        String temp = name[i];
                        name[i] = name[j];
                        name[j] = temp;
                    }
                }
            }
            System.out.println("\nAfter performing lexicographical order: ");
            for (int i = 0; i < name.length; i++) {
                System.out.println(name[i]);
            }
        }
    }
}