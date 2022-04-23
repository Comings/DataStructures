package com.Coming.leetCode.offer;

/**
 * ��Ʊ�������
 */
public class Number_63 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 2};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        /**
         * ת�Ʒ��̣�����������ǰi-1���������͵����������-ǰi-1����Сֵ
         * profit[i] = max(profit[i-1] , max(prices[i]-prices(0:i-1)))
         * �Ż��󷽳� profit=max(profit,prices[i]?min(cost,prices[i])
         */
        int cost = Integer.MAX_VALUE,profit = 0;
        for( int price :prices){
            cost = Math.min(price,cost);
            profit = Math.max(profit,price-cost);

        }
        return  profit;                             

    }

}
