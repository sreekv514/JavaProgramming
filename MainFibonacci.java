/* Program to print Fibonacci series using loop
 * @author Vandana
 */
 
import java.util.Scanner;

class Output {  // Class to shorten and customize print() lines.
    public void prtfn (Object o){
        System.out.println("\t " +o);
    }
    public void prtf (Object o) {
        System.out.print("\t " +o);
    }
}

class Fibonacci extends Output {   // Single inheritance from Output class
    public void loop (int n) {     // Method to print Fibonacci series using loop
        int i = 0, j = 1, sum = 0, cnt = 2;
        // Switch-case displays n places in the series as specified by user
        switch (n) {
            case 0:
                prtf(i);
                break;
            case 1:
                prtf(i+ "\t " +j);
                break;
            default:
                prtf(i+ "\t " +j);
                while(cnt<n) {
                    sum = i + j;
                    prtf(sum);
                    i = j;
                    j = sum; 
                    ++cnt;
                    if(cnt%5 == 0)  // Inserts new line after printing every 5 numbers
                        prtfn(" ");
                }
        }
    }
}

public class MainFibonacci {         // Driver class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Output op = new Output();
        
        op.prtfn("*** FIBONACCI SERIES ***\n");
        op.prtf("Enter a number: ");
        int n = sc.nextInt();
        
        op.prtfn("Fibonacci series till " +n+ " places : ");
        Fibonacci fib = new Fibonacci();
        fib.loop(n);    // Call method to print Fibonacci series
        op.prtfn("\n");
    }
}
