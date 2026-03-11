//https://neetcode.io/problems/three-integer-sum/question?list=neetcode150
package solutions.twoPointers;
import java.util.*;

public class ThreeSumMain {

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

        ThreeSumSolution sol = new ThreeSumSolution();
        List<List<Integer>> result = sol.threeSum(nums);

        System.out.println(result);
    }
}

class ThreeSumSolution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }

                else if (sum < 0) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return ans;
    }
}
