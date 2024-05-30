package PCQs_30_5_24;

public class Ques5 {
    public static void main(String[] args) {
        int n =5;
        printDiamond(n);
    }
    public static void printDiamond(int n) {
        for (int i = 1; i <=n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2* i-1); k++){
                System.out.print("*");
            }    
            System.out.println();   
        }
        for (int i = n-1; i>=1; i--){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

