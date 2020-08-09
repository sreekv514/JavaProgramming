/*
 * @author Vandana
 * Program demonstrating use of switch-case in Java
 */

import java.util.Scanner;

public class SwitchCase {

    public static void prtf(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args) {
        prtf("  Program to demonstrate switch...case statement\n");
        int choice;
        char ch = 'y';
        Scanner sc = new Scanner(System.in);
        prtf("\t What would you like to tell me?");
        prtf("\t1. Hi \n\t2. Hey \n\t3. Hello \n\t4. Goodbye");
        
        do
        {
            prtf("\t Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
            case 1: prtf("\t You said hi!\n\t Hi to you too!");
                    prtf("\t I'm so glad we met!");
                    break;
            case 2: prtf("\t You said hey!\n\t Hey to you too!");
                    prtf("\t But seriously... We have got to stop meeting like this.");
                    break;
            case 3: prtf("\t You said hello!\n\t Hello to you too!");
                    prtf("\t It's so nice to see you... you know, through the cam.");
                    prtf("\n\n\t Gotcha. Don't freak out, I'm just kidding.");
                    break;
            case 4: prtf("\t Oh, you have to leave...\n\t I understand.\n\t Goodbye!");
                    prtf("\t Fare thee well!");
                    break;
            default: prtf("\t Oops! That's not allowed. I'll let you try it again.");
            } 
            if (choice >= 1 && choice <= 3)
                {
                prtf("\n\t Would you like to try the other options too? Y/N: ");
                System.out.flush();
                ch = sc.next().charAt(0);
                if(ch!='y' || ch!='Y' || ch!='n' || ch!='N')
                    prtf("I don't understand you! (-_-) I quit!");
                }
            else if (choice == 4)
                {
                prtf("\n\t Do you want to exit? Y/N: ");
                System.out.flush();
                ch = sc.next().charAt(0);
                switch (ch) {
                    case 'y':
                    case 'Y':
                        ch = 'N';
                        break;
                    case 'n':
                    case 'N':
                        ch = 'Y';
                        break;
                    default:
                        prtf("I don't understand you! :'| I quit!");
                        continue;
                }
                }
            else
                continue;
        } while(ch == 'y' || ch == 'Y');
    }
}
