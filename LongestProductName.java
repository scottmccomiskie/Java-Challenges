import java.util.Arrays;
import java.util.List;

public class LongestProductName {

    /*
     Scenario:
     A beauty supplier wants to identify the longest product name
     from a list for use in its stock report.
    */

    public static String findLongestProductName(List<String> productNames) {

        // 1. Return "" if the list is null or empty
        if(productNames == null || productNames.isEmpty()){
            return "list is empty";
        }

        // 2. Create a variable to store the current longest product name
        String longestProductName = "";


        // 3. Loop through every product name
        for (String product : productNames){

            // 4. Ignore null or blank product names
            if(product == null){
                continue;
            }

            // 5. Trim spaces from the product name
            String cleanProduct = product.trim().toLowerCase();

            // 6. If the cleaned name is longer than the current longest name,
            if(cleanProduct.length() > longestProductName.length()) {
                //    update the current longest name
                longestProductName = cleanProduct;
            }




        }

        // 7. Return the longest product name

        return longestProductName;
    }

    public static void main(String[] args) {

        List<String> productNames = Arrays.asList(
                " Wax Pot ",
                "Strip Wax",
                null,
                "Oil",
                "Pre-Wax Cleansing Lotion"
        );

        System.out.println(findLongestProductName(productNames));

        // Expected: Pre-Wax Cleansing Lotion
    }
}