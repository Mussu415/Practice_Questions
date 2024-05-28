package PCQs_28_5_24;
// Check if number is prime or not 
class IsPrime{
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i =2; i <= Math.sqrt(num);i++){
            if(num % 1 == 0){
                return false;
            }
        }
        return true;
    }
}


public class Ques1 {
    public static void main(String[] args) {
        int number =7;
        if(IsPrime.isPrime(number)){
            System.out.println(number + " is a prime number.");
        }
        else{
            System.out.println(number+ " is not a prime number.");
        }
    }
}
