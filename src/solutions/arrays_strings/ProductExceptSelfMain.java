//https://neetcode.io/problems/products-of-array-discluding-self/question?list=neetcode150
package solutions.arrays_strings;
import java.util.Arrays;

public class ProductExceptSelfMain {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        ProductExceptSelfSolution sol = new ProductExceptSelfSolution();
        int[] result = sol.productExceptSelf(nums);

        System.out.println("Result: " + Arrays.toString(result));
    }
}

class ProductExceptSelfSolution {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            int prod = 1;

            for (int j = 0; j < n; j++) {

                if (i != j) {
                    prod *= nums[j];
                }

            }

            res[i] = prod;
        }

        return res;
    }
}
