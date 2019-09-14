import java.util.*;
public class ReturnSum
{
    public static final Scanner INPUT = new Scanner (System.in);

    public static void main(String args[])
    {
        // write the logic to get the sum
        System.out.println(thirdMethod());
    }

    // firstMethod()
    public static int firstMethod(){
        return 5;
    }
    // secondMethod()
    public static double secondMethod(){
        double num = INPUT.nextDouble();
        return num;
    }
    // thirdMethod()
    public static float thirdMethod(){
        int num1 =firstMethod();
        double num2 =secondMethod();
        return (float) (num1+ num2) ;
    }
}
