class Solution {
    public int maxProfit(int[] prices) {
        int maxNow=0;
        int max=0;
        for (int i=1;i<prices.length;i++){
            
                maxNow=Math.max(maxNow+=(prices[i]-prices[i-1]),0);
                max=Math.max(max,maxNow);
        }
        return max;
    }
}