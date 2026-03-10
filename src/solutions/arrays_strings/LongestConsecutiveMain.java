//https://neetcode.io/problems/longest-consecutive-sequence/question?list=neetcode150
package solutions.arrays_strings;
import java.util.HashSet;

public class LongestConsecutiveMain {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        Sequence sol = new Sequence();
        int ans = sol.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + ans);
    }
}

class Sequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
