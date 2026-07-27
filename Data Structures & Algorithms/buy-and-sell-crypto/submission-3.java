// class Solution {
//     public int maxProfit(int[] prices) {
//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int price : prices) {
//             if (price < minPrice) {
//                 minPrice = price;  // better buying price
//             } else {
//                 maxProfit = Math.max(maxProfit, price - minPrice);
//             }
//         }

//         return maxProfit;
//     }
// }


public class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                res = Math.max(res, sell - buy);
            }
        }
        return res;
    }
}