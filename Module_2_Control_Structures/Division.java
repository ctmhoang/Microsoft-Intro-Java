import java.util.Scanner;
public class Division 
{
	public static void main(String args[])
    {	
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        // Write the logic to check the given number is divisible or not.
        if((num % 2 != 0 || num % 3 != 0) && num % 5 == 0 && num % 10 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    } 
} 
