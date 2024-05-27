package PCQs_27_5_24;
// swapping 2 no's

public class Ques1 {
    public static void main(String[] args) {
        int a=10;
        int b =30;
        System.out.println("Value of A before swapping is: "+ a);
        System.out.println("Value of B before swapping is: "+ b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("value of A after swapping is: "+ a);
        System.out.println("Value of B after swapping is: "+ b);
    }
}
