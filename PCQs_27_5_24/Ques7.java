package PCQs_27_5_24;

//Find factorial of a number
public class Ques7 {
    public static void main(String[] args) {
        int n=8;
        long factorial=1;
        

        // desending order 5*4*3*2*1
        /*for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of a number is: "+ factorial);
    }*/
    
    // ascending order 1*2*3*4*5
    for (int i=n;i>=1;i--){
        factorial=factorial*i;
    }
    System.out.println("The factorial of the numbers is: "+ factorial);
}
}
