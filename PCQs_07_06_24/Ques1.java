package PCQs_07_06_24;
import java.util.Scanner;

//Linear search 
public class Ques1 {
    int a[]=new int[10]; int key;
    void getData(){
        Scanner s = new Scanner(System.in);
        int i;
        for(i=0; i<10; i++){
            System.out.println("Enter array number: ");
            a[i]= s.nextInt();
        }
        System.out.println("Enter number to search: ");
        key = s.nextInt();
    }
    void Search(){
        int i; 
        int flag=0;
        int pos=0;
        for (i=0; i<10 && flag==0; i++){
            if(a[i]==key){
                flag=1;
                pos=i+1;
            }
        }
        if(flag==1){
            System.out.println("Number found at index "+ pos);
        } else{
            System.out.println("Number not found");
        }
    }
    public static void main(String[] args) {
        Ques1 q= new Ques1();
        q.getData();
        q.Search();
    }
}
