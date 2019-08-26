//Write a program to take the input from the console, read the input using scanner and print it.

import java.util.*;
public class ScannerInput
{
	public static void main(String args[])
    {
	    // Using Scanner read the input from the console and print 
	    Scanner getMessage = new Scanner(System.in);
	    String s = getMessage.nextLine();
	    System.out.println(s);
    }
}
