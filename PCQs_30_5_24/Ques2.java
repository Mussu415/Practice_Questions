package PCQs_30_5_24;

//factorial

public class Ques2 {
    public static void main(String[] args) {
        int n=8;
        long factorial=1;
    for (int i=n;i>=1;i--){
        factorial=factorial*i;
    }
    System.out.println("The factorial of the numbers is: "+ factorial);
}
}
