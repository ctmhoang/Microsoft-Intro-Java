//Write a program to concatenate four strings separated by a single space and then print the result.

import java.util.*;
public class StringConcat
{
	public static void main(String args[])
    {
        String s1 = "Get"; // First string
        String s2 = "SET";// Second String
        String s3 =  "Go"; // Third String
        String s4 = "NOW"; // Fourth String;
        String stringAll = ""; // Empty string to hold the 4 concatenated strings

        // Write the logic to concatenate four string variables and print.
        stringAll = s1 + " " + s2 + " " + s3 + " " + s4;
        System.out.println(stringAll);
    }
}
