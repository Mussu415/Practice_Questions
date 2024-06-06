package PCQs_05_6_24;
import java.util.*;

// roman to integer without addition

public class Ques2 {
    public static void romanToInt(String s) {
            int total = 0;
            int current = 0;
            int previous = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i+1);
            char p = s.charAt(i);
            
          
            switch (c) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
            }
            
            switch (p) {
                case 'I':
                    previous = 1;
                    break;
                case 'V':
                    previous = 5;
                    break;
                case 'X':
                    previous = 10;
                    break;
            }
            
            if(current == previous){
             System.out.print(previous);
            }
            else if (previous > current){
              System.out.print(previous);
            }
            else{
              System.out.println(current-previous);
              i++;
            }
        }
        
        // return total;
    }

    public static void main(String[] args) {
        String romanNumber = "XXIV";
        System.out.println("The output is:- ");
        romanToInt(romanNumber);
    }
}