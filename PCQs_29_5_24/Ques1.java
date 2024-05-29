import java.util.Scanner;

//to check if a string is palindrome or not  
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your string: ");
        String str=sc.next();
        String org_str=str;
        String r="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            r=r+str.charAt(i);
        }
        if(org_str.equals(r)){
            System.out.println(org_str + " is Palindrome");
        }
        else{
            System.out.println("Not a palindrome string.");
        }    
    }
}
