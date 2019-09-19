import java.util.Scanner;
public class Crypto
{
	 public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // Write the logic
        char[] letters =  str.toCharArray();
        for(char letter : letters){
            System.out.print((char)((int)letter + 3));
        }
    }
}
