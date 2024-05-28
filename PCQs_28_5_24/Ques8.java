package PCQs_28_5_24;

// to count the occurrences of a character in a string.
import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + ch + "' in '" + str + "': " + count);
    }
}