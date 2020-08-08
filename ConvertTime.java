/* Program to convert seconds into minutes, hours, days and years
 * @author Vandana
 */
import java.util.Scanner;

public class ConvertTime {

    public static void prtf(String str) // reduced print function
    {
        System.out.println(str);
    }
    
    public static void outtime(long minutes, int choice) // method to calculate time conversion
    {
        long hours = minutes/60;
        long rem_min = minutes%60;
        long days = hours/24;
        long rem_hrs = hours%24;
        long years = days/365;
        int rem_days = (int) (days%365);
        
        switch(choice)
        {
            case 1 -> { // Hours and minutes
                prtf("\t" +minutes+ " minutes are " +hours+ " hour(s) and " +rem_min+ " minute(s).");
                break;
            }
            case 2 -> { // Days and minutes
                rem_min += (rem_hrs*60);
                prtf("\t" +minutes+ " minutes are " +days+ " day(s) and " +rem_min+ " minute(s).");
                break;
            }
            case 3 -> { //Days and hours
                prtf("\t" +minutes+ " minutes are " +days+ " day(s) and " +rem_hrs+ " hour(s).");
                break;
            }
            case 4 -> { // Years and days
                prtf("\t" +minutes+ " minutes are " +years+ " year(s) and " +rem_days+ " day(s).");
                break;
            }
            default -> {
                prtf("Invalid choice!");
                return;
            }
        }
    }

    public static void main(String args[]) {    // main method
        Scanner sc = new Scanner(System.in);
        char optExit = 'y';
        prtf(" ***Program to convert minutes to desired format*** ");
        
        do
        {
            prtf("  Enter time in minutes: ");
            long minutes = sc.nextLong();
            prtf(" Choose the desired output format: ");
            prtf("  1. Hours and minutes\n  2. Days and minutes\n  3. Days and hours\n  4. Years and days");
            prtf("  Enter your choice: ");
            int choice = sc.nextInt();
            outtime(minutes, choice);
            
            System.out.flush();
            
            prtf("\t Do you wish to continue? Y/N: ");
            optExit = sc.next().charAt(0);
            
        } while(optExit == 'y' || optExit == 'Y');
        
        prtf(" ***Program terminated*** ");
    }
}
