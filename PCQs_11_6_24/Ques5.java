package PCQs_11_6_24;

public class Ques5 {
    public static void generateParentheses(int n) {
        char[] current = new char[2 * n];
        generateAll(current, 0, 0, n);
    }
    
    public static void generateAll(char[] current, int open, int close, int n) {
        if (open == n && close == n) {
            System.out.println(String.valueOf(current));
            return;
        }

        if (open < n) {
            current[open + close] = '(';
            generateAll(current, open + 1, close, n);
        }

        if (close < open) {
            current[open + close] = ')';
            generateAll(current, open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println("Output for n = " + n1 + ":");
        generateParentheses(n1);

        int n2 = 1;
        System.out.println("\nOutput for n = " + n2 + ":");
        generateParentheses(n2);
    }
}
