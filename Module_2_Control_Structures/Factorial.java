import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Write the logic here
        int clone = num;
        while(clone > 1){
            clone -= 1;
            num *= clone;
        }
        System.out.println(num);
    }
}
