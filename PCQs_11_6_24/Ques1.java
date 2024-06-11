package PCQs_11_6_24;

public class Ques1 {
    public static void main(String[] args) {
    String inputString = "the quick brown fox";
    String maskString = "queen";
        
    String result = removeDuplicates(inputString, maskString);
        
    System.out.println("The given string is: " + inputString);
    System.out.println("The given mask string is: " + maskString);
    System.out.println("The new string is: ");
    System.out.println(result);
}
public static String removeDuplicates(String input, String mask) {
    char[] inputChars = input.toCharArray();
    char[] maskChars = mask.toCharArray();                     
    boolean[] maskArray = new boolean[256]; // Assuming ASCII characters
    // Mark characters present in mask string
        for (char c : maskChars) {
            maskArray[c] = true;
        }
        StringBuilder result = new StringBuilder();
        
        // Iterate through input string and check if each character should be added
        for (char c : inputChars) {
            // If character is not present in mask string or it is not a duplicate
            if (!maskArray[c] || result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
