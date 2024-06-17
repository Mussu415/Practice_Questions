package PCQs_14_6_24;
import java.util.*;
// * * * *
//  * * *
//   * *
//    *
public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

 