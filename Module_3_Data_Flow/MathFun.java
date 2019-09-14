import java.util.Scanner;
public class MathFun
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // write the logic to find the square root of the given number
        double s = (Math.floor(Math.sqrt(num)*100.0))/100;
        System.out.println(s);
    }
}
