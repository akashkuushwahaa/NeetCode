//https://neetcode.io/problems/is-anagram/question?list=neetcode150

package solutions.arrays_strings;
import java.util.Arrays;

public class ValidAnagramMain {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        ValidAnagramSolution sol = new ValidAnagramSolution();

        boolean result = sol.isAnagram(s, t);

        System.out.println("Is Anagram: " + result);
    }
}

class ValidAnagramSolution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return Arrays.equals(sSort, tSort);
    }
}
