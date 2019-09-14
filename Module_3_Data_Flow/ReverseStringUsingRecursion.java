import java.util.Scanner;
public class ReverseStringUsingRecursion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        // Implement the logic to reverse the string using recursion
        System.out.println(reverseStr(s1));
    }
    private static String reverseStr(String s){
        if(s.length() == 1){
            return s;
        }
        else{
            return s.charAt(s.length() - 1) + reverseStr(s.substring(0,(s.length()-1)));
        }
    }
}
