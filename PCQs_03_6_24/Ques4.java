package PCQs_03_6_24;
import java.util.ArrayList;
// valid parentheses
public class Ques4 {
    public boolean isValid(String s){
        if(s==null || s.length()==0){
            return true;
        }
        int parenthesesCount=0;
        int squareBracketsCount=0;
        int curlyBracesCount=0;
        ArrayList<Character> arr=new ArrayList<Character>();
        for(char c: s.toCharArray()){
            if (c=='(') {
                parenthesesCount++;
                arr.add('(');
            }
            else if (c=='[') {
                squareBracketsCount++;
                arr.add('[');
            }
            else if (c=='{') {
                curlyBracesCount++;
                arr.add('{');
            }
            else if (c==')') {
                if(arr.get(arr.size()-1) !='(') 
                    return false; 
                if (parenthesesCount == 0) return false;
                parenthesesCount--;
                arr.remove(arr.size()-1);
            }
            else if (c==']') {
                if(arr.get(arr.size()-1) !='[') return false; 
                if (squareBracketsCount == 0) return false;
                squareBracketsCount--;
                arr.remove(arr.size()-1);
            }
            else if (c=='}') {
                if(arr.get(arr.size()-1) !='{') return false; 
                if (curlyBracesCount == 0) return false;
                curlyBracesCount--;
                arr.remove(arr.size()-1);
            }
            // if (parenthesesCount<0 || squareBracketsCount<0 || curlyBracesCount<0) {
            //     return false;
        }
        return parenthesesCount==0 && squareBracketsCount==0 && curlyBracesCount==0;
    }
    public static void main(String[] args) {
        Ques4 solution=new Ques4();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("({[}()]"));   //false
    }
}

