public class DiscountedBasket {

    /*
     Scenario:
     A shop gives a discount to the single most expensive product
     in a customer’s basket.

     Write calculateTotalPrice(prices, discount).

     - prices is an array of product prices.
     - discount is a percentage between 0 and 100.
     - Only the most expensive item gets the discount.
     - Return the final total as an int.
     - Any decimal result is rounded down automatically.
    */

    public static int calculateTotalPrice(int[] prices, int discount) {

        // 1. check for nulls return -1
        // 2. store highest item
        // 3. loop through prices
        // 4. apply discount
        // 5. round down math.floor

        if(prices == null){
            return -1;
        }

        int highestPricedItem = 0;

       for(int price : prices){
           if(price > highestPricedItem){
               highestPricedItem = price;
           }
       }

       int calculateDiscount = highestPricedItem / 100 * discount;

       int result = highestPricedItem - calculateDiscount;


        return result;
    }

    public static void main(String[] args) {

        int[] prices = {120, 300, 200};
        int discount = 20;

        System.out.println(calculateTotalPrice(prices, discount));

        // Expected £300 with 20% off becomes £240
    }
}