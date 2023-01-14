package leetcode.maxProfit;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int maximumProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]-prices[i]>maximumProfit)
                    maximumProfit=prices[j]-prices[i];
            }
        }
        return maximumProfit;

    }
}
