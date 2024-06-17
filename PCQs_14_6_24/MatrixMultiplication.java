package PCQs_14_6_24;
import java.util.Scanner;

//matrix multiplication
class Ques2 {
    int a[][]= new int[3][3];
    int b[][]= new int[3][3];
    int c[][]= new int[3][3];
    int i,j;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for matrix1:- ");
        for(i=0;i<3;i++){
            for (j = 0; j < 3; j++) {
                //System.out.println("Enter number:- ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements for matrix2:- ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                //System.out.println("Enter number:- ");
                b[i][j]=sc.nextInt();
            }
        }
    }

    void putData(){
        System.out.println("First matrix is: ");
        for (i = 0; i < 3; i++) {
            for(j=0; j<3; j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println("Second matrix is: ");
        for ( i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++){
                System.out.print(b[i][j]+"   ");
            }
            System.out.println();
        }
    }

    void multiply(){
        int k;
        for (i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++){
                c[i][j]=0;
                for (k = 0; k < 3; k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][i];
                }
            }
        }
                System.out.println("Multiplication is:- ");
                for(i=0; i<3; i++){
                    for(j=0; j<3; j++){
                        System.out.print(c[i][j]+"   ");
                    }
                    System.out.println();
                }
            }
        }

public class MatrixMultiplication {
    public static void main(String args[]) {
        Ques2 aa = new Ques2();
            aa.getData();
            aa.putData();
            aa.multiply();
    }
}