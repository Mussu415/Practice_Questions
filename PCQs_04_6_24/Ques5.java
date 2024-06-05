package PCQs_04_6_24;

//pangram 
public class Ques5 {
    public static boolean isPangram(String str){
        if(str==null || str.isEmpty()){
            return false;
        }
        boolean[] seenLetters = new boolean[26];
        str=str.toLowerCase();
        for(char c: str.toCharArray()){
            if(c>='a' && c<='z'){
                int index =c-'a';
                seenLetters[index]=true;
            }
        }
        for(boolean seen : seenLetters){
            if(!seen){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Abcdefghijklmtuvwxyz";
        System.out.println("The string is: "+ str);
        if(isPangram(str)){
            System.out.println("Yes the string is a pangram");
        } else {
            System.out.println("No the string is not a pangram");
        }
    }
}
