public class stockProblem {
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;        
    }
 

    public static void main(String[] args) {
        int rate[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(rate));
    }
}
