//https://neetcode.io/problems/max-water-container/question?list=neetcode150
package solutions.twoPointers;
public class MaxAreaMain {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        MaxAreaSolution sol = new MaxAreaSolution();
        int ans = sol.maxArea(height);

        System.out.println("Max Area: " + ans);
    }
}

class MaxAreaSolution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r) {
            int currentArea = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(max, currentArea);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
