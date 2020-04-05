class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,l=prices.length,i=0;
        while(i<l-1){
            while((i<l-1)&&(prices[i+1]<=prices[i]))
                i++;
            int min=prices[i];
            i++;
            while((i<l)&&(prices[i]>=prices[i-1]))
                i++;
            profit+=prices[i-1]-min;
        }
        return profit;
    }
}