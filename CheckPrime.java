/* Program to check whether a number is prime or not
 * @author Vandana
 */
import java.util.Scanner;

public class CheckPrime {
    // Method to shorten print statement
    static void prtf(Object o){
        System.out.print("\n\t " +o);
    }
    
    // Method to test if integer n is prime.
    static boolean testPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i<n; i++){
            if((n%i) == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        prtf("*** Program to check whether given number is prime *** \n");
        char ch = 'y';
        do {
            // Read integer as input from user
            prtf("Enter any value: ");
            int n = sc.nextInt();
            
            // Call method to check if the number is prime
            boolean isPrime = testPrime(n);  
            
            // Display output according to test result
            if(isPrime) {
                prtf(n+ " is a prime number.\n");
            }
            else {
                prtf(n+ " is not a prime number.\n");
            }
            
            // Ask if user wants to rerun program
            prtf("Would you like to check another number? Y/N: ");
            System.out.flush();
            ch = sc.next().charAt(0);
            switch (ch) {
                case 'y', 'Y', 'N', 'n' ->  { break; } 
                default -> prtf("Invalid input, autodefaulted choice to \"no\".\n");
            }
        } while (ch == 'y' || ch == 'Y');
        prtf(" *** End of Program *** \n");
    }
}
