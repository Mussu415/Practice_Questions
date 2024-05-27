package PCQs_25_5_24;
//Method overloading

class Sum{
    
    public int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int arr[]){
        int temp=0;
        for (int i=0; i<arr.length;i++){
            temp+=arr[i];
        }
        return temp;
    }
}

public class Ques7 {
    public static void main(String[] args) {
        Sum s1=new Sum();
        int a= s1.sum(12,8);
        System.out.println("The sum of 2 no's is: "+ a);
        int b= Sum.sum(12, 8, 4);
        System.out.println("The sum of 3 no's is: "+ b);
        int[] arr={1,2,3,4,5,6,7,8,9};
        int c= Sum.sum(arr);
        System.out.println("The sum if the array arr is: " + c);
    }
}
