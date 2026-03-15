package solutions.slidingWindow;
import java.util.*;

public class MaxProfitMain {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        MaxProfitSolution sol = new MaxProfitSolution();
        int result = sol.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}

class MaxProfitSolution {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);

            int currProfit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, currProfit);
        }

        return maxProfit;
    }
}
