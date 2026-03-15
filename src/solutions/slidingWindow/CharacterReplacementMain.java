package solutions.slidingWindow;
import java.util.*;

public class CharacterReplacementMain {

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        CharacterReplacementSolution sol = new CharacterReplacementSolution();
        int result = sol.characterReplacement(s, k);

        System.out.println("Longest substring length after replacement: " + result);
    }
}

class CharacterReplacementSolution {

    public int characterReplacement(String s, int k) {

        int uniqueCount = 0;
        int left = 0;
        int max = 0;

        int[] count = new int[26];

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            uniqueCount = Math.max(uniqueCount, ++count[c - 'A']);

            int replaceCount = right - left + 1 - uniqueCount;

            if (replaceCount > k) {
                count[s.charAt(left++) - 'A']--;
            }
            else {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
}
