package PCQs_31_5_24;

//import java.util.Arrays;

//program to replace character with its occurrences
/*
Input : OPENTEXT
Output : OPEN1EX2
 */
public class Ques2 {
    public static void main(String[] args) {
        String input = "OPENTEXT";
        char charToReplace='T';
        if (input.indexOf(charToReplace)==-1) {
            System.out.println("Given Character not available in input string..");
            System.exit(0);
        }
        int count = 1;
        for(int i =0; i<input.length(); i++){
            char ch = input.charAt(i);
            if (ch == charToReplace) {
               input= input.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
               count ++;
            }
        }
        System.out.println(input);


        /*char[] arr= input.toCharArray();
        int count = 1;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==charToReplace){
                arr[i]=String.valueOf(count).charAt(0);
                count ++;
            }
        }
        System.out.println(Arrays.toString(arr));
    */
    }
}
