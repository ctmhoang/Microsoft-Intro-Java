import java.util.Scanner;
public class DigitNumber
{
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Write the logic to check given number is greater or less than the above digit number
        int counter = 0;
        int detached = num;
        while (detached != 0){
            counter += 1;
            detached /= 10;
        }
        System.out.println(counter + "-digit Number");
	}
}
