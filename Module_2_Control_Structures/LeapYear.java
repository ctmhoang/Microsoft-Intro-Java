import java.util.Scanner;
public class LeapYear
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        //boolean flag = false;
        // Write logic to find given number is divisible by 5 or not
        if (num % 5 == 0){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

        // Print flag value
    }
}
