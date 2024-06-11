package PCQs_11_6_24;

public class Ques2 {
    public static void main(String[] args) {
        String[] items = {"rabbit", "bribe", "dog"};
        String word = "bib";
        
        System.out.println("The given strings are: ");
        for (String item : items) {
            System.out.print(item + "   ");
        }
        System.out.println("\nThe given word is: " + word);
        
        System.out.println("\nThe strings containing all the letters of the given word are: ");
        for (String item : items) {
            if (containsAllLetters(item, word)) {
                System.out.println(item);
            }
        }
    }
    
    public static boolean containsAllLetters(String item, String word) {
        for (char c : word.toCharArray()) {
            if (item.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    } 
}
