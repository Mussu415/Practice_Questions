package PCQs_27_5_24;

//reverse a string

public class Ques3 {
    public static void main(String[] args) {
    String original="SUNEHA";
    String r="";
    int len=original.length();
    for(int i=len-1;i>=0;i--){
        r=r+original.charAt(i);
    }
    System.out.println("Reverse String: "+ r);
}    
}
