package Arrays;
public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int n = prices.length;
        int result = buyAndSellStocks(prices,n);
        System.out.println("Max Profit "+result);
    }

    public static int buyAndSellStocks(int[] prices, int n) {
        int buyingPrice=Integer.MAX_VALUE,maxProfit=0,profit=0;
        for(int i=0;i<n;i++){
            int sellingPrice=prices[i];
            if(buyingPrice<sellingPrice){
                profit = sellingPrice - buyingPrice; 
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyingPrice = sellingPrice;
            }
            
        }
        return maxProfit;
    }
}
