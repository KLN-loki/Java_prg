import java.util.*;
public class VowelsConsonents {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter No. of Strings: ");
            int n = s.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter a String: ");
                arr[i] = s.next();
            }
            for (int i = 0; i < n; i++) {
                int v = 0, c = 0;
                char[] ch = arr[i].toCharArray();
                for (char x : ch) {
                    if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I'
                            || x == 'O' || x == 'U') {
                        v++;
                    } else {
                        c++;
                    }
                }
                System.out.println("consonant: " + c + " vowels: " + v);
            }
        }

    }
}
