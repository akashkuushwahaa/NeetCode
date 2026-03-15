package solutions.slidingWindow;
import java.util.HashSet;

public class LongestSubstringMain {

    public static void main(String[] args) {

        String s = "abcabcbb";

        LongestSubstringSolution sol = new LongestSubstringSolution();
        int result = sol.lengthOfLongestSubstring(s);

        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }
}

class LongestSubstringSolution {

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int left = 0;
        int right = 0;
        int ans = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {

            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);

            ans = Math.max(ans, right - left + 1);

            right++;
        }

        return ans;
    }
}
