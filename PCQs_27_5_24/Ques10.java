package PCQs_27_5_24;
import java.util.Scanner;
//Armstrong number
public class Ques10 {
    public static void main(String[] args) {
        int n, arm=0 ,rem,c;
        System.out.println("Enter any number: ");
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        c=n;

        while (n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }
    }
}
