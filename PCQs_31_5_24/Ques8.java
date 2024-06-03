package PCQs_31_5_24;

public class Ques8 {
    int maxProfit(int[] prices){
        int buy_price = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] < buy_price){
                buy_price = prices[i];
            }
            else{
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Ques8 solution = new Ques8();
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Stock Prices: ");
        printArray(prices);

        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
    public static void printArray(int[] nums){
        for(int num:nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
