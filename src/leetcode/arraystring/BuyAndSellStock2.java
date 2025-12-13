package leetcode.arraystring;

public class BuyAndSellStock2 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maximumProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j <= prices.length-1; j++) {
                if(prices[i] < prices[j]){
                    maximumProfit += (prices[j] - prices[i]);
                    break;
                }else {
                    break;
                }
            }
        }
        return maximumProfit;
    }
}
