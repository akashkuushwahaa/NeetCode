//https://neetcode.io/problems/trapping-rain-water/question?list=neetcode150
package solutions.twoPointers;
public class TrapRainWaterMain {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};

        TrapRainWaterSolution sol = new TrapRainWaterSolution();
        int ans = sol.trap(height);

        System.out.println("Trapped Water: " + ans);
    }
}

class TrapRainWaterSolution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        int water = 0;

        while (left < right) {

            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            }
            else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }

        return water;
    }
}
