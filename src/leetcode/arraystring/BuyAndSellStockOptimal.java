package leetcode.arraystring;

public class BuyAndSellStockOptimal {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
            }else {
                maxprofit = Math.max(maxprofit, prices[i]-min);
            }
        }
        return maxprofit;
    }
}
