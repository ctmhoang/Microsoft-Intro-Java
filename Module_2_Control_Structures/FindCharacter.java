import java.util.*;
public class FindCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char test= 'v';// Character input
        // Write the logic to find the given character is found in the given string using a while loop
        String testClone = Character.valueOf(test).toString();
        while(input.contains(testClone)){
            System.out.println("Found");
            input = sc.next();
        }
        System.out.println("Not Found");
    }
}
