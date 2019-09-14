import java.util.Scanner;
public class Recursion
{
	   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        // Write the logic here
        sum = sum(num);
        System.out.println(sum);
    }

    private static int sum(int num) {
        if (num == 1) {
            return 11;
        } else {
            return 11 * (num) + sum(num - 1);
        }
    }
}
