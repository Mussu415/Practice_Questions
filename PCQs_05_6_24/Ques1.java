package PCQs_05_6_24;
import java.util.*;

// counting number to characters in an string 
public class Ques1 {

    public static String shortString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        char[] chars = input.toCharArray();
        Arrays.sort(chars); 

        String sh = "";
        int currentCount = 1;
        char currentChar = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                currentCount++;
            } else {
                sh += currentCount + "" + currentChar;
                currentCount = 1;
                currentChar = chars[i];
            }
        }

        sh += currentCount + "" + currentChar;

        return sh;
    }

    public static void main(String[] args) {
        String input = "aaaaabbccaa";
        String shortString = shortString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + shortString);
    }
}

