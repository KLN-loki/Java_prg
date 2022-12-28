
import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str1 = s.next();
            char[] ch1 = str1.toCharArray();
            Arrays.sort(ch1);
            String str2 = s.next();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch2);
            if (str1.length() == str2.length()) {
                if (Arrays.equals(ch1, ch2)) {
                    System.out.println("Anagram.");
                } else {
                    System.out.println("Not anagram.");
                }
            }
        }
    }
}
