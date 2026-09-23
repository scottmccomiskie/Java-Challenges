public class primeNumber {

    /*
     Scenario:
     A drone-planning system needs to identify prime-numbered flight zones.
     A prime number can only be divided exactly by 1 and itself.
    */

    public static boolean isPrime(int number) {

        // 1. Numbers below 2 are not prime
        if(number < 2){
            return false;
        }

        // 2. Test every possible divisor, starting at 2
        for (int i = 2; i < number; i++) {
            if(number % i == 0 ){
                return false;
              }
            }

    return true;

    }

    public static void main(String[] args) {

        System.out.println(isPrime(2));   // Expected: true
        System.out.println(isPrime(7));   // Expected: true
        System.out.println(isPrime(10));  // Expected: false
        System.out.println(isPrime(1));   // Expected: false
    }
}