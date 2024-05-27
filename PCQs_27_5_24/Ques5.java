package PCQs_27_5_24;

// how many even and odd numbers are there in a given number
public class Ques5 {
   public static void main(String[] args) {
    int num=1234567;
    int even_count=0;
    int odd_count=0;
    while(num>0){
        int rem= num%10;
        if(rem%2==0){
            even_count++;
        }
        else{
            odd_count++; 
        }
        num=num/10;
    }
    //System.out.println("The number is: "+ num);
    System.out.println("Number of even count is: "+ even_count);
    System.out.println("Number of even count is: "+ odd_count);
   } 
}
