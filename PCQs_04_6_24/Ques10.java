package PCQs_04_6_24;

public class Ques10 {
    public static String replaceSubstring(String sentence, String toReplace, String replacement) {
        int len = sentence.length();
        int toReplaceLen = toReplace.length();
        String result = "";

        for (int i = 0; i < len; ) {
            // Check if the substring to replace is found at the current position
            int j = 0;
            while (j < toReplaceLen && i + j < len && sentence.charAt(i + j) == toReplace.charAt(j)) {
                j++;
            }

            if (j == toReplaceLen) {
                // Substring found, append the replacement
                result += replacement;
                i += toReplaceLen;
            } else {
                // Substring not found, append the current character
                result += sentence.charAt(i);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String sentence = "A batman with bat";
        String toReplace = "bat";
        String replacement = "snow";
        
        String newSentence = replaceSubstring(sentence, toReplace, replacement);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("New Sentence: " + newSentence);
    }
}


