import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxProfitFromStock {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
       String result =  calculateMaxProfitBySellingStock(arr);

        System.out.println(result);
    }

    public static String calculateMaxProfitBySellingStock (int [] arr) {
        int maxProfit = 0;
        int miniPrice = arr[0];
        int maxPrice = 0;

        for(int i = 1; i < arr.length; i++){
            int cutProfit = miniPrice - arr[i];

            maxProfit = max(maxProfit, cutProfit);
            miniPrice = min(miniPrice, arr[i]);
            maxPrice = arr[i];
        }
        return "Maximum Profit is: "+maxProfit +" Stock Buy at Price :"+miniPrice+" and sell at Price: "+maxPrice;
    }
}
