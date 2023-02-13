package program;

import helpers.Range;
import modules.Console;
import modules.Numbers;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //create some objects
        Console console = new Console();
        Numbers nums = new Numbers();

        //welcome the user
        console.println("Welcome to my numbers program!");
        console.println("------------------------------");
        console.newLine();

        //prompt for inputs
        int low = console.getInt("Enter a low value");
        int high = console.getInt("Enter a high value");
        Range range = new Range(low, high);

        //show the results
        int[] result = nums.numsIn(range);
        System.out.println(Arrays.toString(result));
    }
}

