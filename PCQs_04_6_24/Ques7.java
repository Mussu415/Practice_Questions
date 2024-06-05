package PCQs_04_6_24;

import java.util.Scanner;

// string contains palindrome 
public class Ques7 {
    public static boolean isPali(String st){
        boolean pali = true;
        for(int i=0; i<(st.length()/2); i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i)){
                pali=false;
                break;
            }
        }
        return pali;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a = s.nextLine();

        int last_index = 0;
        String replace="";

        for(int i=0; i<a.length();i++){
            if(a.charAt(i)==' '){
                if(isPali(a.substring(last_index,i))){
                    for(int j=last_index; j<=i-1; j++){
                        replace = replace + "*";
                    }
                    last_index= i+1;
                    replace=replace+ " ";
                }
                else{
                    for(int j = last_index; j<=i-1; j++){
                        replace =replace+a.charAt(j);
                    }
                    last_index = i+1;
                    replace = replace+ " ";
                }
            }
        }
        if(isPali(a.substring(last_index, a.length()))){
            for(int i= last_index; i<a.length(); i++){
                replace = replace+"*";
            }
        } else {
            for (int i=last_index; i<a.length();i++){
                replace = replace+a.charAt(i);
            }
        }
        System.out.println(replace);
    }
}