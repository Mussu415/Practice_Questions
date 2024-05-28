package PCQs_28_5_24;

import java.util.Scanner;

//to find the sum of natural numbers up to a given number.
public class Ques10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
    }
}
