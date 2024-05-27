package PCQs_27_5_24;
import java.util.Scanner;

//reverse a no. 
public class Ques2 {
    public static void main(String[] args) {
       Scanner s1 =new Scanner(System.in);
       System.out.println("Enter a number to reverse: ");
       int num=s1.nextInt();
        int r =0;
        while (num!=0){
            r=r*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse number is: "+ r);
    }
}
