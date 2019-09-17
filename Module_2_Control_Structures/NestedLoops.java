import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // Write the logic using nested loop.
        String[] words = str.split("\\s+");
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if(Character.isUpperCase(word.charAt(i))){
                    System.out.print(Character.toLowerCase(word.charAt(i)));
                }
                else{
                    System.out.print(Character.toUpperCase(word.charAt(i)));
                }
            }
            System.out.print(" ");
        }
    }
}

//Remerber \s \s+ \s*
