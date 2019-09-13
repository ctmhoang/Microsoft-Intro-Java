import java.util.*;

public class MethodOverloading
{
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Hello";// First String
        String s2 = sc.next(); // Second String
        // Call the Method2();
        Method2(s1, s2);
    }
    private static void Method2(String s){
        System.out.println(s);
    }
    private static void Method2(String s1, String s2){
        Method2(s1 + s2);
    }
}
