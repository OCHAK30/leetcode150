package leetcode.arraystring;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j <= prices.length-1; j++) {
                if(prices[i] < prices[j]){
                    maxprofit = Math.max(maxprofit, (prices[j]-prices[i]));
                }
            }
        }
        return maxprofit;
    }
}
