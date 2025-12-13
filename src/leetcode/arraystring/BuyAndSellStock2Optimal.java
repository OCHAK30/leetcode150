package leetcode.arraystring;

public class BuyAndSellStock2Optimal {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
            }else {
                maximumProfit += (prices[i]-min);
                min = prices[i];
            }
        }
        return maximumProfit;
    }
}
