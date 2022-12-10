public class Best_Time_to_Buy_and_Sell_Stock_II122 {
    /**
     * 可用动态规划做也可以贪心，贪心的话就是每次只取赚的正数
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            sum += Math.max(prices[i] - prices[i - 1], 0);
        }
        return sum;
    }
}

