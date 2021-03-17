import java.io.*;

public class BuySellStock {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter stock prices : ");
            String s = br.readLine();
            String arr[] = s.split(" ");
            int stocks[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                stocks[i] = Integer.parseInt(arr[i]);       //  7 1 5 3 6 4
            }
            System.out.println("Maximum profit can be : " + maxProfit(stocks));     // maximum profit is 5
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    static int maxProfit(int[] prices) {
        int maxcost = 0, minprice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (minprice > prices[i])
                minprice = prices[i];
            maxcost = maxcost >= prices[i] - minprice ? maxcost : prices[i] - minprice;
        }
        return maxcost;
    }
}