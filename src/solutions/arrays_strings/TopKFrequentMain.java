//https://neetcode.io/problems/top-k-elements-in-list/question?list=neetcode150

package solutions.arrays_strings;
import java.util.*;

public class TopKFrequentMain {

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        TopKFrequentSolution sol = new TopKFrequentSolution();
        int[] result = sol.topKFrequent(nums, k);

        System.out.println("Top K Frequent Elements:");
        System.out.println(Arrays.toString(result));
    }
}

class TopKFrequentSolution {

    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> count.get(a) - count.get(b)
        );

        for (int n : count.keySet()) {
            heap.add(n);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
