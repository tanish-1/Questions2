package rev;

public class BestTimeToBuyAndBuy {

    static  int maxProfit(int[] prices){
        int profit = 0;
        int minimal = prices[0];
        for(int buy = 1 ; buy<prices.length ; buy++){
           int cost = prices[buy] - minimal;
           profit = Math.max(profit,cost);
           minimal = Math.min(minimal,prices[buy]);
        }
        return profit;
    }
//    static int maxProfit(int[] prices){
//        int profit = 0;
//        int profitmax = Integer.MIN_VALUE;
//        for(int buy = 0 ; buy<prices.length ; buy++){
//            for(int sell = buy+1 ; sell<prices.length ; sell++){
//                profit = prices[sell] - prices[buy];
//                if(profit>profitmax){
//                    profitmax = profit;
//                }
//            }
//        }
//        if(profitmax<0){
//            return 0;
//        }
//        return profitmax;
//    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
