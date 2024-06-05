package PCQs_04_6_24;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][]matrix = new int[rows][columns];

        System.out.println("Enter matrix elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j]=scanner.nextInt();
            }
        }

        int[][] transpose = new int[columns][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original matrix: ");
        for(int i=0; i<columns; i++){
            for(int j=0; j<rows; j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
