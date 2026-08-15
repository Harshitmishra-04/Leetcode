class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int min = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < min){
                min = price;
            }

            int profit = price - min;
            maxP = Math.max(profit,maxP);
        }
        return maxP;
    }
}