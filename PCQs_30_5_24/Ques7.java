package PCQs_30_5_24;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the starting number of the A.P. series: ");
        int start = scanner.nextInt();

        System.out.print("Input the number of items for the A.P. series: ");
        int n = scanner.nextInt();

        System.out.print("Input the common difference of A.P. series: ");
        int d = scanner.nextInt();

        int sum = 0;
        int currentTerm = start;
        
        System.out.print("The Sum of the A.P. series are :\n");

        for (int i = 0; i < n; i++) {
            System.out.print(currentTerm);
            if (i < n - 1) {
                System.out.print(" + ");
            }
            sum += currentTerm;
            currentTerm += d;
        }

        System.out.println(" = " + sum);
    }
}

