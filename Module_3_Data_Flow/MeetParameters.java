import java.util.*;
public class MeetParameters
{
	 public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Double  num1 = sc.nextDouble();

        // Call the Method1() using the Scanner input
        Method1(num1);
    }
    // Method1() contains one parameter which is of type double
    private static void Method1(double num){
        Method2((int)num);
    }
    // Method 2() contains one parameter which is of type int
    private static void Method2(int num){
        System.out.println(num * 3);
    }
}
