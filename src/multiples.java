//****************************************************
// Multiple.Java       Author: Lewis/Loftus
//
//Demonstates the use of a for loop.
//****************************************************
import java.util.Scanner;

class Multiples
{
    //----------------------------------------------------------
    // Prints multiples of a user-specific number up to a user-
    // specific limit.
    //----------------------------------------------------------

    public static void main (String[] args)
    {
        final int PER_LINE = 5;
        int value, limit, mult, count = 0;

        Scanner keyboard = new Scanner (System.in);

        System.out.print("Enter a positive value ");
        value = keyboard.nextInt();

        System.out.print("Enter an upper limit: ");
        limit = keyboard.nextInt();

        System.out.println();
        System.out.println("The mutiples of " + value + " between " +
                value + " and " + limit + " (inclusive) are: ");

        for (mult = value; mult <= limit; mult += value)
        {
            System.out.print (mult + "\t");
            // Print a specific number of values per line of output
            count++;

            if (count % PER_LINE == 0)
            {
                System.out.println();
            }// End if
        }//End for loop
    }// End method main
}// class Multiples