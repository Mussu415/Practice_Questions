package PCQs_04_6_24;

public class Ques8 {
    public static String reverseWords(String str) {
        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.' || c == ',' || c == ' ' || c == '\t') {
               
                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }
                result += c;
                word = "";
            } else {
                word += c;
            }
        }
        for (int j = word.length() - 1; j >= 0; j--) {
            result += word.charAt(j);
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "www.google.com";
        String output = reverseWords(input);
        System.out.println("Output: " + output);  
    }
}


