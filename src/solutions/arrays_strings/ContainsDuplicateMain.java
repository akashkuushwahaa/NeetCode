//https://neetcode.io/problems/duplicate-integer/question?list=neetcode150

package solutions.arrays_strings;

import java.util.Arrays;

public class ContainsDuplicateMain {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        ContainsDuplicateSolution sol = new ContainsDuplicateSolution();
        boolean result = sol.hasDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}

class ContainsDuplicateSolution {

    public boolean hasDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
