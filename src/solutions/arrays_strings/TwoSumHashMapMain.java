//https://neetcode.io/problems/two-integer-sum/question?list=neetcode150

package solutions.arrays_strings;
import java.util.HashMap;

public class TwoSumHashMapMain {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSumHashMapSolution sol = new TwoSumHashMapSolution();
        int[] result = sol.twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

class TwoSumHashMapSolution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[]{ map.get(diff), i };
            }

            map.put(num, i);
        }

        return new int[]{};
    }
}
