/* Program to read and display employee details using object array
 * @author Vandana
 */

import java.util.Scanner;

class Employee
{
    // Attributes
    String name, address;
    int year;
    // Setter
    public void setDetails(String ename, int yoj, String eadd)
    {
        name = ename;
        year = yoj;
        address = eadd;
    }
    // Getter
    public void getDetails()
    {
        System.out.println(name+ " \t " +year+ " \t\t\t " +address);
    }
}

public class EmployeeRecords{
    static final Scanner sc = new Scanner(System.in);
    
    public static void prtf(String str)
    {   // Reduced print function
        System.out.print(str);
    }
    
    public static void main(String args[]){
        System.out.println("\n *** Program to read and display employee details *** ");
        // Ask user for number of employees
        prtf("\n Enter number of employees to record details: ");
        int n = sc.nextInt();
        
        // Create an object array of class Employee  
        Employee[] objEmp = new Employee[n];
        
        // Read details of employees from user
        int i = 0, yoj = 0;
        String ename, eadd;
        while(i<n)
        {
            sc.nextLine(); // To avoid return being read as String later
            
            prtf("\n No. " +(i+1));
            prtf("\n Enter employee name: ");
            ename = sc.nextLine();
            prtf(" Enter address: ");
            eadd = sc.nextLine();
            prtf(" Enter year of joining: ");
            yoj = sc.nextInt();
            
            // Create and initialize actual object
            objEmp[i] = new Employee(); 
            objEmp[i].setDetails(ename, yoj, eadd); 
            ++i;
        }
     
        // Display details to user
        prtf("\n\n\t EMPLOYEE RECORDS");
        prtf("\n Name \t Year of joining \t Address\n");
        i = 0;
        while(i<n)
        {   // Read from object array
            objEmp[i].getDetails(); 
            ++i;
        }    
  }
}
