//https://neetcode.io/problems/two-integer-sum-ii/question?list=neetcode150
package solutions.twoPointers;
public class TwoSumMain {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSumSolution sol = new TwoSumSolution();
        int[] ans = sol.twoSum(nums, target);
        System.out.println("Index: [" + ans[0] + ", " + ans[1] + "]");
    }
}

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
