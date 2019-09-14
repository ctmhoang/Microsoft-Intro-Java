import java.util.Scanner;
public class StringMethods
{
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(); // Get String value
        String s2 = "cat"; // find the String from the above string
        if(s1.contains(s2)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
        // Write the logic to find the string from the given string
	}
}
