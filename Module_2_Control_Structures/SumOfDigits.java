import java.util.Scanner; 
public class SumOfDigits
{
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        int sum = 0;
        // Write the logic to print Sum of N digits.
        for(int i =1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
