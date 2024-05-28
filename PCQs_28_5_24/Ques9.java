package PCQs_28_5_24;
import java.util.Scanner;

//factorial using recursion
public class Ques9 {    
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner1.nextInt();
        long factorial = findFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static long findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}


