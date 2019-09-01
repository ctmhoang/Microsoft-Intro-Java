import java.util.*;

public class LowerToUpper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); // String value
        StringBuilder returnWord = new StringBuilder();
        // Write the logic to convert upper case to lower case and lower to upper
        int range = word.length();
        for (int i = 0; i < range; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                returnWord.append(Character.toLowerCase(word.charAt(i)));
            } else {
                returnWord.append(Character.toUpperCase(word.charAt(i)));
            }
        }
        System.out.println(returnWord);
    }
}


//must remember StringBuilder & append & Character ;)
