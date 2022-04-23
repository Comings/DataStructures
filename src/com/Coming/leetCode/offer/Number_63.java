package com.Coming.leetCode.offer;

/**
 * 股票最大利润
 */
public class Number_63 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 2};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        /**
         * 转移方程：最大利润等于前i-1天最大利润和当天最大利润-前i-1天最小值
         * profit[i] = max(profit[i-1] , max(prices[i]-prices(0:i-1)))
         * 优化后方程 profit=max(profit,prices[i]?min(cost,prices[i])
         */
        int cost = Integer.MAX_VALUE,profit = 0;
        for( int price :prices){
            cost = Math.min(price,cost);
            profit = Math.max(profit,price-cost);

        }
        return  profit;                             

    }

}
