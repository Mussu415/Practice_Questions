package PCQs_31_5_24;

//removing duplicate ocurrences of a character in a string 
public class Ques1 {
    public static void main(String[] args) {
        String str ="tejaswini";  
        String result ="";

        for(int i=0; i<str.length();i++){
            char currentChar=str.charAt(i);
            boolean isDuplicate = false;

            for(int j=0; j<result.length(); j++){
                if(result.charAt(j)==currentChar){
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate) {
                result += currentChar;
            }
        }
        System.out.println("Original String: "+ str);
        System.out.println("String without duplicates: "+ result);
    }
}
