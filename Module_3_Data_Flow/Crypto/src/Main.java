

public class Main {

    public static void main(String[] args) {
        // test functions
        System.out.println(normalizeText("This is some \"really\" great. (Text)!? "));
        System.out.println(obify("ADDSOMEOB"));
        System.out.println(caesarify("ILIKEZOOS", 1));
        System.out.println(caesarify("ILIKEAPPLES",-1));
        System.out.println(groupify("HITHERE", 2));
        System.out.println(encryptString("Who will win the election?",5,3));
        String cyphertext = encryptString("Who will win the election?",5,3);
        System.out.println(ungroupify("THI SIS ARE ALL YGR EAT SEN TEN CEX"));
        System.out.println(decryptString(cyphertext, 5));
    }

    public static String normalizeText(String plainText) {
        //Return all of chars uppercase and remove
        //any punctuation and white space from the line of text
        String normalizeText = plainText.replaceAll("[^a-zA-Z]", "").toUpperCase();
        return normalizeText;
    }

    public static String obify(String normalizeText) {
        //take in the normalizedText and insert a capital 0 & B
        //in front of every vowel including y
        String obfuscateText = "";
        char[] textArray = normalizeText.toCharArray();
        for(char word : textArray){
            if(word =='A' || word == 'E'||word == 'U'||word == 'I'||word == 'Y'||word == 'O'){
                obfuscateText = obfuscateText.concat("OB"+word);
            }
            else{
                obfuscateText = obfuscateText.concat(word+"");
            }
        }
    return obfuscateText;
    }
    public static String caesarify(String obfuscateText, int shiftValue){
        //take every letters individually and shift it down in
        //alphabet a set number of times
        //Return the codes has been shifted
        String cipheredText = "";
        char[] charsToConvert = obfuscateText.toCharArray();
        for(char word : charsToConvert){
            int temp = (int)word;
            if(temp+ shiftValue > 90){
                temp -= 26;
            }
            if(temp + shiftValue < 65){
                temp += 26;
            }
            cipheredText = cipheredText.concat((char)(temp+ shiftValue) + "");
        }
        return cipheredText;
    }

/* Helper code that I did not use
public static String shiftAlphabet(int shift) {
    int start = 0;
    if (shift < 0) {
        start = (int) 'Z' + shift + 1;
    } else {
        start = 'A' + shift;
    }
    String result = "";
    char currChar = (char) start;
    for(; currChar <= 'Z'; ++currChar) {
        result = result + currChar;
    }
    if(result.length() < 26) {
        for(currChar = 'A'; result.length() < 26; ++currChar) {
            result = result + currChar;
        }
    }
    return result;
}*/
    public static String groupify(String cipheredText, int divideTo){
        //Chunks the code into user stated sized chunks
        // Inserts a white space between a certain number of char
        // If text not evenly divisible by group size, adds some buffer at the end of the code
        String splitText = "";
        int strIndex = 0, endIndex = divideTo;
        for(; endIndex < cipheredText.length(); endIndex += divideTo){
            splitText = splitText.concat((cipheredText.substring(strIndex, endIndex))+" ");
            strIndex += divideTo;
        }
        if(endIndex > cipheredText.length()){
            splitText = splitText.concat(" "+ cipheredText.substring(strIndex));
            for(int i = 0; i < endIndex - cipheredText.length(); i ++){
                splitText = splitText.concat("X");
            }
        }
        return splitText;
    }
    public static String encryptString(String someText, int shiftValue, int groupSize){
        //Puts every thing together
        return groupify((caesarify(obify(normalizeText(someText)),shiftValue)),groupSize);
    }
    public static String ungroupify(String groupifiedText){
        String[] listOfWords = groupifiedText.split(" ");
        String endWord = listOfWords[listOfWords.length - 1] ;
        char[] endChars = endWord.toCharArray();
        String endWordWithoutX = "";
        String ungroupifiedText ="";
        for(char temp : endChars){
            if(temp != 'X'){
                endWordWithoutX = endWordWithoutX.concat(temp+ "");
            }
        }
        listOfWords[listOfWords.length - 1] = endWordWithoutX;

        for(String word: listOfWords){
            ungroupifiedText = ungroupifiedText.concat(word);
        }
    return  ungroupifiedText;
    }

    public static String decryptString(String encryptedText, int shiftValue){
        String ungroupifiedText = ungroupify(encryptedText);
        String obfuscateText = caesarify(ungroupifiedText, -shiftValue);
        return obfuscateText.replaceAll("OB", "");
    }
}