import java.util.Arrays;
import java.util.List;

public class largestNumber {

    public static int findLargestNumber(List<Integer> numbers) {

        // 1. Handle a null or empty list

        if (numbers == null ){
            return -1;
        }


        // 2. Create a variable to store the largest number
        int storeLargestNum = 0;

        // 3. Loop through each number
        for(int number : numbers) {

            // 4. If the number is larger than the current largest,

            if(number > storeLargestNum){
                //    update the largest number
                storeLargestNum = number;
            }

        }

        // 5. Return the largest number

        return storeLargestNum;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                12, 45, 8, 99, 31
        );

        System.out.println(findLargestNumber(numbers));

        // Expected: 99
    }
}