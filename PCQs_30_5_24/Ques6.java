package PCQs_30_5_24;
import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Input starting number of range: ");
        int start = scanner1.nextInt();

        System.out.print("Input ending number of range: ");
        int end = scanner1.nextInt();

        System.out.println("The prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


